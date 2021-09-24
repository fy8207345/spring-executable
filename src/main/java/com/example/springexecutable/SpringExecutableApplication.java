package com.example.springexecutable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringExecutableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExecutableApplication.class, args);
    }

    @ResponseBody
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
