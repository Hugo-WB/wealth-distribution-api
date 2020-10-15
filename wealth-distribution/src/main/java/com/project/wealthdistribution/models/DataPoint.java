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
    private Integer countryCode;
    private Integer year;
    
    @ElementCollection
    private List<Integer> quartilesPercentages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryId(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Integer> getQuartilesPercentages() {
        return this.quartilesPercentages;
    }

    public void setQuartilesPercentages(List<Integer> percentiles) {
        this.quartilesPercentages = percentiles;
    }
}
