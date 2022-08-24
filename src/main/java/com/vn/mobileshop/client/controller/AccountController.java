package com.vn.mobileshop.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/account")
public class AccountController {
    @GetMapping("login")
    public String login(){
        return "view/login";
    }

    @GetMapping("forgot")
    public String forgotPassword(){
        return "view/forgot-password";
    }

    @GetMapping("create")
    public String createAccount(){
        return "view/create-account";
    }
}
