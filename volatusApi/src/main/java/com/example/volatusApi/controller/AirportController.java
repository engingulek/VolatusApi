package com.example.volatusApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.volatusApi.business.abstracts.AirportService;
import com.example.volatusApi.core.response.AirportListResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/airport/")
@AllArgsConstructor
@NoArgsConstructor
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("getAll")
    public List<AirportListResponse> getAll(){
        return airportService.getAirportListResponse();
    }
}
