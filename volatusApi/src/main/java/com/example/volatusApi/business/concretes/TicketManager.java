package com.example.volatusApi.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.volatusApi.business.abstracts.TicketService;
import com.example.volatusApi.core.mappers.ModelMapperService;
import com.example.volatusApi.core.response.TicketListReponse;
import com.example.volatusApi.dataAccess.TicketRepository;
import com.example.volatusApi.entities.Ticket;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TicketManager implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ModelMapperService mapperService;
    @Override
    public List<TicketListReponse> TicketListReponses() {
        List<Ticket> tickets = ticketRepository.findAll();
        List<TicketListReponse> ticketListReponses = tickets.stream()
        .map(ticket -> mapperService.forResponse().map(ticket, TicketListReponse.class))
       .collect(Collectors.toList());
       return ticketListReponses;
        
    }
    @Override
    public List<TicketListReponse> filterTicketList(Integer departureAirportId, Integer arrivalAirportId, String date) {
        List<Ticket> tickets = ticketRepository.findByDepartureAirportIdAndArrivalAirportIdAndDate(departureAirportId, arrivalAirportId, date);
        List<TicketListReponse> ticketListReponses = tickets.stream()
        .map(ticket -> mapperService.forResponse().map(ticket, TicketListReponse.class))
       .collect(Collectors.toList());
       return ticketListReponses;
    }
    
}
