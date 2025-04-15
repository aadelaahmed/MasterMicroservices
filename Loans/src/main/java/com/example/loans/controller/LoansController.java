package com.example.loans.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @Value("${env.name}")
    private String envName;

    @GetMapping("/envName")
    public String printEnvName(){
        return envName;
    }
}