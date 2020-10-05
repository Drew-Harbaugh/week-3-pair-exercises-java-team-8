package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    private String phoneNumber;
    private List<String> pets;





    public Customer(String firstName, String lastName, String phoneNumber){
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }


    public Customer(String firstName, String lastName){
        this(firstName, lastName, "");
    }

    public Customer() {

    }


    public String getPhoneNumber(){
        return phoneNumber;
    }

    public List<String> getPets(){
        return pets;
    }

    public void setPets(List<String> pets){
        this.pets = pets;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double count = 0;

        for (Map.Entry<String, Double> services : servicesRendered.entrySet()){
            count = count + services.getValue();

        } return count;
    }
}
