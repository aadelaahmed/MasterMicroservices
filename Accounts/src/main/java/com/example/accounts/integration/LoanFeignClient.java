package com.example.accounts.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "loans-feign-client",url = "${loans.service.url}")
public interface LoanFeignClient {
    @GetMapping("loans/hello")
    String sayHello();
}
