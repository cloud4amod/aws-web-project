package com.aws.web.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello !!";
    }

    @GetMapping("/hello2")
    public String getHello2(){
        return "Hello Amod, How are you!!";
    }
}
