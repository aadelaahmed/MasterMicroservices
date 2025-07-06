package com.example.loans.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/loans/")
public class LoansController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello from loans microservice";
    }
}
