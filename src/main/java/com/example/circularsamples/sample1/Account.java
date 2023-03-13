package com.example.circularsamples.sample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Account {

    private Customer customer;

    @Autowired
    public Account(@Lazy Customer customer) {
        this.customer = customer;
    }
}