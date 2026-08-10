package com.anudip.MyFirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

    @GetMapping("/trainer")
    public String trainer(){
        return "Trainer Details";
    }

}
