package com.example.accounts.controller;

import com.example.accounts.model.response.FullDetailsResponse;
import com.example.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts/")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("fullDetails")
    public FullDetailsResponse getFullDetails(){
        return accountService.getFullDetails();
    }
}
