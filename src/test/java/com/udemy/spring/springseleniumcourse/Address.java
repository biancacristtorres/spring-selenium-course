package com.udemy.spring.springseleniumcourse;

import org.springframework.stereotype.Component;

@Component //spring you need to care of those object creation
public class Address {

    private  String street;
    public Address() {
        this.street = "rua Maria Elizabet Pessoa 200";
    }

    public  String getStreet(){
        return street;
    }
}
