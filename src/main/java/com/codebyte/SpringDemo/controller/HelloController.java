package com.codebyte.SpringDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld(){
    return "welcome to daily code buffer!! srinivas reddy kollu ";
    }
    
}
