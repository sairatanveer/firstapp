package com.saira.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String sayHelloGet()
    {
        return "Hello World from get";
    }
    @PostMapping("/")
    public String sayHelloPost()
    {
        return "Hello World from post";
    }
    @PutMapping("/")
    public String sayHelloPut()
    {
        return "Hello World from put ";
    }
    @DeleteMapping("/")
    public String sayHelloDelete()
    {
        return "Hello World from delete";
    }


}
