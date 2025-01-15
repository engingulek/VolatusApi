package com.example.volatusApi.core.response;

import com.example.volatusApi.entities.Airport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketListReponse {

    private Long id;

    private String airlinesIcon;
    private String airlineName;
    private String planeType;
    private String departureClock;
    private String landingClock;
    private int price;
    private String date; 

    private Airport departureAirport;

    private Airport arrivalAirport;
}
