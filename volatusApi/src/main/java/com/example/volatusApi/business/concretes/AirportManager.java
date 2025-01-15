package com.example.volatusApi.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.volatusApi.business.abstracts.AirportService;
import com.example.volatusApi.core.mappers.ModelMapperService;
import com.example.volatusApi.core.response.AirportListResponse;
import com.example.volatusApi.dataAccess.AirportRepository;
import com.example.volatusApi.entities.Airport;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AirportManager implements AirportService {
    @Autowired
    private AirportRepository airportRepository;
    @Autowired
    private ModelMapperService mapperService;
    
    @Override
    public List<AirportListResponse> getAirportListResponse() {
        List<Airport> airports = airportRepository.findAll(); 
       List<AirportListResponse> airportListResponses = airports.stream()
       .map(airport -> mapperService.forResponse().map(airport, AirportListResponse.class))
       .collect(Collectors.toList());
       return airportListResponses;
    }

    
}
