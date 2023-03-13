package com.example.circularsamples.sample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private Account account;

    @Autowired
    public Customer(@Lazy Account account) {
        this.account = account;
    }
}