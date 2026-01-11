package com.example.miniProjetDevOps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    @GetMapping("/index")
    public String app(){
        return "Bonjour et bon courage dans votre projet en DevOps";
    }
}
