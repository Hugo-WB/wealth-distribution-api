package com.hugo.wealthdistribution.dao;

import com.hugo.wealthdistribution.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakedao")
public class FakeCountryDataAccessService implements CountryDao {
    private static List<Country> DB = new ArrayList<>();
    @Override
    public int insertCountry(String name, Country country){
        DB.add(new Country(name,country.getYear()));
        return 1;
    }

}
