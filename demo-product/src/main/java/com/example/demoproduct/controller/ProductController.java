package com.example.demoproduct.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class ProductController {
    @RequestMapping("/hello")
    public String test(){
        System.out.println("HEllo");
        return "Hello World";
    }
}
