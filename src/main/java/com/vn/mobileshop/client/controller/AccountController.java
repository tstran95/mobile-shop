package com.vn.mobileshop.client.controller;

import com.vn.mobileshop.client.services.AccountService;
import com.vn.mobileshop.model.Account;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/api/v1/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

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
        System.out.println(accountService.findAllAccount().get(3).getRoles().size());
        return "view/create-account";
    }

    @PostMapping("create")
    public String createAccountPost(@Valid @ModelAttribute("account") Account account, BindingResult bindingResult){
        account.isPasswordsEqual();
        if (bindingResult.hasErrors()) {
            return "view/create-account";
        }
        accountService.save(account);
        return "view/login";
    }
}
