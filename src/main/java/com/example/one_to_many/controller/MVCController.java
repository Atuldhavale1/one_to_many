package com.example.one_to_many.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

    @GetMapping("/home-page")
    public String showHome(){
        return "home";
    }
}
