package com.hugo.wealthdistribution.api;

import com.hugo.wealthdistribution.model.Country;
import com.hugo.wealthdistribution.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/country")
@RestController
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

//    @GetMapping
//    public void getCountry(Country country){
//        countryService.getCountry()
//    }

    @PostMapping

    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }

    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
    @GetMapping(path="{id}")
    public Country getCountryById(@PathVariable("id") UUID id){
        return countryService.getCountryById(id)
                .orElse(null);

    }


}