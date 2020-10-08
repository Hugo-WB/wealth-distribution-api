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
        Optional<Country> countryMaybe = selectCountryById(id);
        if (countryMaybe.isEmpty()){return 0;}
        DB.remove(countryMaybe.get());
        return 1;
    }

    @Override
    public int updateCountryById(UUID id,Country country) {
        return selectCountryById(id).map(c->{
            int indexOfPersonToUpdate = DB.indexOf(c);
            if (indexOfPersonToUpdate>=0){
                DB.set(indexOfPersonToUpdate,new Country(id,country.getName(),country.getYear()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
