package com.anudip.MyFirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    @GetMapping("/college")
    public String college(){
        return "College Details";
    }

}