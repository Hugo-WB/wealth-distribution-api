package com.hugo.wealthdistribution.dao;

import com.hugo.wealthdistribution.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeCountryDataAccessService implements CountryDao {
    private static List<Country> DB = new ArrayList<>();

    @Override

    public int insertCountry(UUID id, String name, Country country) {
        DB.add(new Country(id, name, country.getYear()));
        return 1;
    }

    @Override
    public List<Country> selectAllCountries() {
        return DB;
    }

    @Override
    public Optional<Country> selectCountryById(UUID id) {
        return DB.stream()
                .filter(country -> country.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteCountryById(UUID id) {
        return 0;
    }

    @Override
    public int updateCountryById(UUID id) {
        return 0;
    }
}
