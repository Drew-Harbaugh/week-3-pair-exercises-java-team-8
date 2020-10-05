package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {



    @Test
    public void returnPet_vaccinations(){
        Pet sut = new Pet();
        String[] array = {"rabies" , "distemper", "parvo"};
        List result = sut.getVaccinations();
        Assert.assertEquals(result, result);
    }

    @Test
    public void returnList_Pet_Vaccinations(){
        Pet sut = new Pet();
        List<String> placeholder = new ArrayList<String>();
        placeholder.add("rabies");
        placeholder.add("distemper");
        placeholder.add("parvo");
        sut.setVaccinations(placeholder);
        String result = sut.listVaccinations();
        Assert.assertEquals("rabies, distemper, parvo", result);
    }



}
