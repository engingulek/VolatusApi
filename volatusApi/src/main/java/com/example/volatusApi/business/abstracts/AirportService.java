package com.example.volatusApi.business.abstracts;

import java.util.List;

import com.example.volatusApi.core.response.AirportListResponse;

public interface AirportService {
    List<AirportListResponse> getAirportListResponse();
}
