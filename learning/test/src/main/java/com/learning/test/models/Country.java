package com.learning.test.models;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
@Table(name="countries")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String code;
    private String name;

    // SET
    public void setId(Integer id){
        this.id = id;
    }
    public void setCode(String Code){
        this.code = Code;
    }
    public void setName(String name){
        this.name = name;
    }

    // GET
    public Integer getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }

}
