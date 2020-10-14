package com.project.wealthdistribution.repositories;

import com.project.wealthdistribution.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country,Integer> {

    List<Country> findByRegion(String region);

}
