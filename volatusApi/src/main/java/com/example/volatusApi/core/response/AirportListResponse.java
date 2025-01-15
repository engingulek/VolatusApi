
package com.example.volatusApi.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportListResponse {

    private Long id;

   
    private String country;

  
    private String city;

   
    private String code;

  
    private String airname;
}