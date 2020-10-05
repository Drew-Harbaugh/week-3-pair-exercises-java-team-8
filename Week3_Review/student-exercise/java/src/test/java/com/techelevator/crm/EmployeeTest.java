package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {


    @Test
    public void returnEmployee_Discount(){
        Employee sut = new Employee();
        Map<String, Double> discount = new HashMap<>();
        discount.put("grooming", 15.65);
        discount.put("walking", 10.50);
        discount.put("sitting", 25.75);
        sut.getBalanceDue(discount);
        double result = sut.getBalanceDue(discount);
        Assert.assertEquals(46.65, result, 0.001);
    }



}
