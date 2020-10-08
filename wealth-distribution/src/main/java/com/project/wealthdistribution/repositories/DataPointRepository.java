package com.project.wealthdistribution.repositories;

import com.project.wealthdistribution.models.DataPoint;
import org.springframework.data.repository.CrudRepository;

public interface DataPointRepository extends CrudRepository<DataPoint,Integer> {
}
