package com.hugo.wealthdistribution.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

    private final String name;
    private final Integer year;

    public Country(@JsonProperty("name") String name, @JsonProperty("year") Integer year){
        this.name= name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }
}
