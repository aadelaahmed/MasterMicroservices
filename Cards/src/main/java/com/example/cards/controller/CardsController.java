package com.example.cards.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cards/")
public class CardsController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello from cards microservice";
    }
}
