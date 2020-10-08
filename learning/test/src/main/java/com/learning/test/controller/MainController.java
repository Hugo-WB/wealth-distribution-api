package com.learning.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.learning.test.repositories.CountryRepository;
import com.learning.test.models.*;

@RequestMapping
@RestController
public class MainController {
    @Autowired
    private CountryRepository countryRepository;

    @PostMapping(path="/countries")
    public @ResponseBody String addNewCountry(@RequestBody Country country){
        System.out.println(country);
        countryRepository.save(country);
        return "Saved";
    }

    @GetMapping(path="/countries")
    public @ResponseBody Iterable<Country> getAllCountries(){
        return countryRepository.findAll();
    }
}
