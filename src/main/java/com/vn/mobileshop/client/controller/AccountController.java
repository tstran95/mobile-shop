package com.vn.mobileshop.client.controller;

import com.vn.mobileshop.model.Account;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/account")
public class AccountController {
    @ModelAttribute
    Account setupForm () {
        return new Account();
    }

    @GetMapping("login")
    public String login(){
        return "view/login";
    }

    @PostMapping("login")
    public String loginForm() {
        System.out.println("LOGIN");
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

    @PostMapping("create")
    public String createAccountPost(@Valid @ModelAttribute("account") Account account, BindingResult bindingResult){
        account.isPasswordsEqual();
//        bindingResult.addError();
        if (bindingResult.hasErrors()) {
            return "view/create-account";
        }
        System.out.println(account);
        return "view/create-account";
    }
}
