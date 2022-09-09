package com.example.exercisedp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {

    private int id;
    private String name;
    private String country;
    private String industry;


    public Company(String name, String country, String industry) {
        this.name = name;
        this.country = country;
        this.industry = industry;
    }

    public Company(String prp){

        String [] v = prp.split(",");
        id = Integer.parseInt(v[0]);
        name = v[1];
        country = v[2];
        industry = v[3];
    }

    public String describe(){
        return id + "," + name + "," + country + "," + industry;
    }
}
