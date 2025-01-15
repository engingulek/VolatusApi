package com.example.volatusApi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name= "tickets")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String airlinesIcon;
    private String airlineName;
    private String planeType;
    private String departureClock;
    private String landingClock;
    private int price;
    private String date; 

   
    @ManyToOne
    @JoinColumn(name = "from_id", nullable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "to_id", nullable = false)
    private Airport arrivalAirport;
}
