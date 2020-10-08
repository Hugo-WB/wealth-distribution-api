package com.learning.test.repositories;

import com.learning.test.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,Integer> {
}
