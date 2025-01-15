package com.example.volatusApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.volatusApi.business.abstracts.TicketService;
import com.example.volatusApi.core.response.TicketListReponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/ticket/")
@AllArgsConstructor
@NoArgsConstructor
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @GetMapping("getAll")
    public List<TicketListReponse> getAll(){
        return ticketService.TicketListReponses();
    }

    @GetMapping("getTickets")
    public List<TicketListReponse> getTickets(
        @RequestParam int departureAirportId,
        @RequestParam int arrivalAirportId, 
        @RequestParam String date ){
        return ticketService.filterTicketList(departureAirportId, arrivalAirportId, date);
    }

}
