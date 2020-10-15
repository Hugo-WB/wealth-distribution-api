package com.project.wealthdistribution.services;


import com.project.wealthdistribution.models.Country;
import com.project.wealthdistribution.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDataAccessService {
    private CountryRepository countryRepository;

    @Autowired
    public CountryDataAccessService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

     public Iterable<Country> getAll(){
        return countryRepository.findAll();
    }

    public Country save(Country country){
        return countryRepository.save(country);
    }

    public List<Country> getCountriesByRegion(String region){
        return countryRepository.findByRegion(region);
    }

    public void deleteCountryById(Integer Id){
        countryRepository.deleteById(Id);
    }


}
