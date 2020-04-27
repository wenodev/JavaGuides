package com.example.Spring.Security.In.Memory.Authentication.Example.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebComeController {

    @GetMapping("/")
    public String greeting(Authentication authentication){

        String userName = authentication.getName();

    }



}
