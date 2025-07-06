package com.example.accounts.service.impl;

import com.example.accounts.integration.CardFeignClient;
import com.example.accounts.integration.LoanFeignClient;
import com.example.accounts.model.response.FullDetailsResponse;
import com.example.accounts.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final CardFeignClient cardFeignClient;
    private final LoanFeignClient loanFeignClient;
    @Override
    public FullDetailsResponse getFullDetails() {
        return FullDetailsResponse.builder()
                .cardsDetails(cardFeignClient.sayHello())
                .loansDetails(loanFeignClient.sayHello())
                .build();
    }
}
