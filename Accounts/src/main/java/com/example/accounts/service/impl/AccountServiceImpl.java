package com.example.accounts.service.impl;

import com.example.accounts.integration.CardFeignClient;
import com.example.accounts.integration.LoanFeignClient;
import com.example.accounts.model.response.FullDetailsResponse;
import com.example.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    CardFeignClient cardFeignClient;
    @Autowired
    LoanFeignClient loanFeignClient;
    @Override
    public FullDetailsResponse getFullDetails() {
        return new FullDetailsResponse(
                cardFeignClient.sayHello(),
                loanFeignClient.sayHello()
        );
    }
}
