package com.example.circularsamples.sample3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Account {

    private Customer customer;

    private String message = "Hi!";

    @Autowired
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getMessage() {
        return message;
    }
}