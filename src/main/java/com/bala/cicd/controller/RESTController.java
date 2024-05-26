package com.bala.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
    @GetMapping("/message")
    public String message()
    {
        return "Message from REST Controller";
    }
}

/*
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Balakarthikeyan-A/my-first-go-app.git
git push -u origin main
*/
