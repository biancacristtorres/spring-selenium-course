package com.udemy.spring.springseleniumcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //spring you need to care of those object creation
public class User {

    @Autowired //filed injection, spring will inject those objects
    private Address address;
    @Autowired
    private Salary salary;
//    public  User(Address address, Salary salary) {
//        this.address = address;
//        this.salary = salary;
//    }

    public  void  printDetails() {
        System.out.println("Address: " + this.address.getStreet());
        System.out.println("Salary: " + this.salary.getAmount());
    }
}
