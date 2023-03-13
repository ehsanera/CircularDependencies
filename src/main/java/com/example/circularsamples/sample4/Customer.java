package com.example.circularsamples.sample4;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    private Account account;

    @PostConstruct
    public void init() {
        account.setCustomer(this);
    }

    public Account getAccount() {
        return account;
    }
}