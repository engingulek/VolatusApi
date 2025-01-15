package com.example.volatusApi.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.volatusApi.entities.Ticket;

public interface TicketRepository   extends JpaRepository<Ticket,Long>{
    List<Ticket> findByDepartureAirportIdAndArrivalAirportIdAndDate(Integer departureAirportId, Integer arrivalAirportId, String date);
}
