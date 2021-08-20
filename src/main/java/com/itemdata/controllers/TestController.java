package com.itemdata.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/welcome")
public class TestController {

    @GetMapping
    public String welcome() {
        return "HI WELCOME";
    }
    
    
}
