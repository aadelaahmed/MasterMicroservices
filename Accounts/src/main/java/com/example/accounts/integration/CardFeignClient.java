package com.example.accounts.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cards-feign-client",url = "${cards.service.url}")
public interface CardFeignClient {
    @GetMapping("cards/hello")
    String sayHello();
}
