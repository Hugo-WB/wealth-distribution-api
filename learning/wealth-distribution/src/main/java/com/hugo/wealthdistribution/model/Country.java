package com.hugo.wealthdistribution.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Country {

    private final UUID id;
    @NotBlank
    private final String name;
    @NotNull
    private final Integer year;

    public Country(@JsonProperty("id") UUID id,
                   @JsonProperty("name") String name,
                   @JsonProperty("year") Integer year){
        this.id = id;
        this.name= name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public UUID getId() {return id;}
}
