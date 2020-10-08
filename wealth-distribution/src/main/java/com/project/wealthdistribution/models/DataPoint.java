package com.project.wealthdistribution.models;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Entity
@Table(name="data")
public class DataPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private Integer countryId;
    private Integer year;
    @ElementCollection
    private List<Integer> percentiles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Integer> getPercentiles() {
        return percentiles;
    }

    public void setPercentiles(List<Integer> percentiles) {
        this.percentiles = percentiles;
    }
}
