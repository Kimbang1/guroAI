package com.sns.backend.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {
    
    @GetMapping("/")
    public String test() {
        return "test";
    }
    
}
