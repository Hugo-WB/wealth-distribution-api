package com.project.wealthdistribution.repositories;

import com.project.wealthdistribution.models.DataPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataPointRepository extends JpaRepository<DataPoint,Integer> {

    List<DataPoint> findByCountryCode(String countryCode);


}