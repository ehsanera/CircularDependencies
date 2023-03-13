package com.example.circularsamples.sample4;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private Customer customer;
	
    private String message = "Hi!";

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
	
    public String getMessage() {
        return message;
    }
}