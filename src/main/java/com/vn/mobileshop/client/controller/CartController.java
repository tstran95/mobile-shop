package com.vn.mobileshop.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/cart")
public class CartController {
    @GetMapping
    public String showCart() {
        return "view/cart";
    }

    @GetMapping("checkout")
    public String checkout(){
        return "view/checkout";
    }

    @GetMapping("contact")
    public String showContact(){
        return "view/contact-form";
    }
}
