package models;//package com.hugo.wealthdistribution.modals

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String WIDVariableCode;
    @NotBlank
    private Float Percentage;
    @NotBlank
    private Integer Year;

    private Float value;

    private Integer Age;

    private Integer Population;


    public Country(Long id, @NotBlank String WIDVariableCode, @NotBlank Float percentage, @NotBlank Integer year, Float value, Integer age, Integer population) {
        this.id = id;
        this.WIDVariableCode = WIDVariableCode;
        Percentage = percentage;
        Year = year;
        this.value = value;
        Age = age;
        Population = population;
    }

    public Country() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWIDVariableCode() {
        return WIDVariableCode;
    }

    public void setWIDVariableCode(String WIDVariableCode) {
        this.WIDVariableCode = WIDVariableCode;
    }

    public Float getPercentage() {
        return Percentage;
    }

    public void setPercentage(Float percentage) {
        Percentage = percentage;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }
}
