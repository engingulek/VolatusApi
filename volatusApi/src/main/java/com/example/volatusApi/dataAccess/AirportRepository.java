package com.example.volatusApi.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.volatusApi.entities.Airport;

public interface AirportRepository extends JpaRepository<Airport,Long> {

    
} 
