package com.hugo.wealthdistribution.api;

import com.hugo.wealthdistribution.model.Country;
import com.hugo.wealthdistribution.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/country")
@RestController
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @PostMapping
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }
}
