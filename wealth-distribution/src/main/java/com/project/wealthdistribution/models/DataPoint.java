package com.project.wealthdistribution.models;

import javax.persistence.*;

import java.util.List;

import javax.validation.constraints.NotNull;
@Entity
@Table(name="data")
public class DataPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String countryCode;
    private Integer year;

    private Integer onePercentile;
    @ElementCollection
    private List<Integer> quartilesPercentages;

    public Integer getOnePercentile() {
        return onePercentile;
    }
    public void setOnePercentile(Integer onePercentile) {
        this.onePercentile = onePercentile;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(String countryCode) {
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
