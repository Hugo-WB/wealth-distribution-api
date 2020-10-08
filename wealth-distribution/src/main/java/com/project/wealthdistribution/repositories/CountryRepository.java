package com.project.wealthdistribution.repositories;

import com.project.wealthdistribution.models.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends CrudRepository<Country,Integer> {

}
