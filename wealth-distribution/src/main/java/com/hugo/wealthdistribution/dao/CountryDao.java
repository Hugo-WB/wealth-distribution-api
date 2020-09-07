package com.hugo.wealthdistribution.dao;

import com.hugo.wealthdistribution.model.Country;


public interface CountryDao {
    int insertCountry(String name, Country country);

    default int insertCountry(Country country){
        return insertCountry(country.getName(),country);
    }
}
