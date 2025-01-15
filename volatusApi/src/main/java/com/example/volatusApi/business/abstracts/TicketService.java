package com.example.volatusApi.business.abstracts;

import java.util.List;

import com.example.volatusApi.core.response.TicketListReponse;

public interface TicketService {
    List<TicketListReponse> TicketListReponses();
    List<TicketListReponse> filterTicketList(Integer departureAirportId, Integer arrivalAirportId, String date);
}
