package com.hugo.wealthdistribution.service;

import com.hugo.wealthdistribution.dao.CountryDao;
import com.hugo.wealthdistribution.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CountryService{
    private final CountryDao countryDao;

    @Autowired
    public CountryService(@Qualifier("fakedao") CountryDao countryDao){
        this.countryDao = countryDao;
    }

    public int addCountry(Country country){
        return countryDao.insertCountry(country);
    }
}
