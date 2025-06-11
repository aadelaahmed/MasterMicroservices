package com.example.accounts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @Value("${env.name}")
    private String envName;
    @Value("${build.version}")
    private String buildVersion;
    @GetMapping("/envName")
    public String printEnvName(){
        return envName;
    }
    @GetMapping("/version")
    public String printVersion(){
        return "Current Build Version is: "+buildVersion;
    }
}
