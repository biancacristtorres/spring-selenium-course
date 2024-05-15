package com.udemy.spring.springseleniumcourse;

import org.springframework.stereotype.Component;

@Component //spring you need to care of those object creation
public class Salary {
    private  int amount;

    public Salary(){
        this.amount = 1000;
    }

    public int getAmount(){
        return amount;
    }
}
