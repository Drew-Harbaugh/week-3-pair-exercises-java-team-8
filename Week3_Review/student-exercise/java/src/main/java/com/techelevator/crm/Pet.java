package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {


    private String name;
    private String species;
    private List<String> vaccinations;

    public Pet() {

    }


    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public List getVaccinations(){
        return vaccinations;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public void setVaccinations(List vaccinations){
        this.vaccinations = new ArrayList(vaccinations);
    }


    public Pet(String name, String species){
        this.name = name;
        this.species = species;
    }

    public String listVaccinations(){
        String vaccine = "";
        for (String vac : vaccinations){
            vaccine = vaccine + vac;
            if(vaccinations.indexOf(vac) < vaccinations.size() - 1){
                vaccine = vaccine + ", ";
            }
        }
        return vaccine;
    }



}
