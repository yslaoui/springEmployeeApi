package com.learnSpring.mvcCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showCustomLoginForm() {
        return "custom-login-form";
    }

    @GetMapping("/access-denied")
    public String denyAccess() {
        return "access-denied";
    }


}
