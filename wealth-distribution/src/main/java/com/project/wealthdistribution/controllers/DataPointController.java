package com.project.wealthdistribution.controllers;

import com.project.wealthdistribution.services.DataPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.wealthdistribution.models.DataPoint;

import java.util.List;
import java.util.Optional;

@RequestMapping("/data")
@RestController
public class DataPointController{
    private DataPointService dataPointService;
    @Autowired
    public DataPointController(DataPointService dataPointService){
        this.dataPointService = dataPointService;
    }

    @GetMapping
    public @ResponseBody Iterable<DataPoint> getDataPoints(){
        return dataPointService.getAll();
    }

    @GetMapping(path="/{countryCode}")
    public List<DataPoint> getDataPointByCountryCode(@PathVariable("countryCode") String countryCode){
        return dataPointService.getByCountryCode(countryCode);
    }

    @PostMapping
    public @ResponseBody Country addNewCountry(@RequestBody Country country){
        return countryDataAccessService.save(country);
    }

    @DeleteMapping(path="{countryId}")
    public void deleteCountryById(@PathVariable("countryId") Integer id){
        countryDataAccessService.deleteCountryById(id);
    }
    
}
