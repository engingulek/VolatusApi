package com.example.volatusApi.core.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ModelMapperManager implements  ModelMapperService {
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.LOOSE);
        return  this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration()
        .setAmbiguityIgnored(true)
        .setMatchingStrategy(MatchingStrategies.STANDARD );
        return  this.modelMapper;
    }
    
}