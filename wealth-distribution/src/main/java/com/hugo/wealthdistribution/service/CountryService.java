package com.hugo.wealthdistribution.service;

import com.hugo.wealthdistribution.dao.CountryDao;
import com.hugo.wealthdistribution.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CountryService{
    private final CountryDao countryDao;

    @Autowired
    public CountryService(@Qualifier("fakeDao") CountryDao countryDao){
        this.countryDao = countryDao;
    }

    public int addCountry(Country country){
        return countryDao.insertCountry(country);
    }

    public List<Country> getAllCountries(){
        return countryDao.selectAllCountries();
    }
    public Optional<Country> getCountryById(UUID id){
        return countryDao.selectCountryById(id);
    }
}
