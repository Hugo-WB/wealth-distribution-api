package com.project.wealthdistribution.controllers;

import com.project.wealthdistribution.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.wealthdistribution.models.Country;

import java.util.Optional;

@RequestMapping("/countries")
@RestController
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public @ResponseBody Iterable<Country> getCountries(){
        return countryRepository.findAll();
    }

    @GetMapping(path = "{countryId}")
    public Optional<Country> getCountryById(@PathVariable("countryId") Integer id){
        return  countryRepository.findById(id);
    }
    @PostMapping
    public @ResponseBody String addNewCountry(@RequestBody Country country){
        countryRepository.save(country);
        return "Saved";
    }


    @PutMapping

    @DeleteMapping(path="{countryId}")
    public void deleteCountryById(@PathVariable("countryId") Integer id){
        countryRepository.deleteById(id);
    }

}
