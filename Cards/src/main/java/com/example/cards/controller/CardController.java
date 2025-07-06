package com.example.cards.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardController {
    @GetMapping("hello")
    public String sayHello(){
        return "Hello from cards microservice";
    }
}
