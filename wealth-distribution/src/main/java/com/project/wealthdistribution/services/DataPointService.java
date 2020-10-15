package com.project.wealthdistribution.services;


import com.project.wealthdistribution.models.DataPoint;
import com.project.wealthdistribution.repositories.DataPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataPointService{
  private DataPointRepository dataPointRepository;

  @Autowired
  public DataPointService(DataPointRepository dataPointRepository){
    this.dataPointRepository = dataPointRepository;
  }

  public Iterable<DataPoint> getAll(){
    return dataPointRepository.findAll();
  }

  public List<DataPoint> getByCountryCode(String countryCode){
    return dataPointRepository.findByCountryCode(countryCode);
  }

  

}