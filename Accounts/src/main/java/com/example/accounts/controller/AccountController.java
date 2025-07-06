package com.example.accounts.controller;

import com.example.accounts.model.response.FullDetailsResponse;
import com.example.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/accounts/")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;
    @GetMapping("fullDetails")
    public FullDetailsResponse getFullDetails(){
        return accountService.getFullDetails();
    }
}
