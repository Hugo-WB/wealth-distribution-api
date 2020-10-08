package controller;

import exception.CountryNotFoundException;
import models.Country;
import repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryRepository countryRepository;

    // Get All Countries
    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    // Add a country
    @PostMapping("/countries")
    public Country createCountries(@Valid @RequestBody Country country){
        return countryRepository.save(country);
    }

    // Get a single Country
    @GetMapping("/countries/{id}")
    public Country getCountryById(@PathVariable(value="id") Long countryId) throws CountryNotFoundException {
        return countryRepository.findById(countryId)
                .orElseThrow(()->new CountryNotFoundException(countryId));
    }

    //Update a Country
    @PutMapping("/countries/{id}")
    public Country updateCountryById(@PathVariable(value="id") Long countryId,
                                     @Valid @RequestBody Country countryDetails) throws CountryNotFoundException{
        Country country =
                countryRepository.findById(countryId)
                        .orElseThrow(()->new CountryNotFoundException(countryId));
        Country updatedCountry = countryRepository.save(countryDetails);
        return updatedCountry;
    }
    //Delete a country
    @DeleteMapping("/countries/{id}")
    public ResponseEntity<?> deleteCountryById(@PathVariable(value="id") Long countryId) throws CountryNotFoundException{
        Country country = countryRepository.findById(countryId)
                .orElseThrow(()-> new CountryNotFoundException(countryId));
        countryRepository.delete(country);
        return ResponseEntity.ok().build();
    }
}
