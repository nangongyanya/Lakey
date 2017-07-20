package com.lakey.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Daemon {

    @RequestMapping("/")
    public String index() {
        return "Welcome Spring Boot";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Daemon.class, args);
    }
}
