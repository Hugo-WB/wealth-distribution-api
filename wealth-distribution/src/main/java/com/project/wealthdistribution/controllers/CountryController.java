package com.project.wealthdistribution.controllers;

import com.project.wealthdistribution.services.CountryDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.wealthdistribution.models.Country;

import java.util.List;
import java.util.Optional;

@RequestMapping("/countries")
@RestController
public class CountryController {
    private CountryDataAccessService countryDataAccessService;
    @Autowired
    public CountryController(CountryDataAccessService countryDataAccessService){
        this.countryDataAccessService = countryDataAccessService;
    }

    @GetMapping
    public @ResponseBody Iterable<Country> getCountries(){
        return countryDataAccessService.getAll();
    }

    @GetMapping(path="/region/{region}")
    public List<Country> getCountriesByRegion(@PathVariable("region") String region){
        return countryDataAccessService.getCountriesByRegion(region);
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
