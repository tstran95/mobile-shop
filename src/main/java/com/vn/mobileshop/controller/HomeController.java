package com.vn.mobileshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping
    public String goHomePage() {
        System.out.println("OHOHOH");
        return "view/home";
    }
}
