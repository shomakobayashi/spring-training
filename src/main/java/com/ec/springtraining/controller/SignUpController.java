package com.ec.springtraining.controller;

import com.ec.springtraining.service.UserApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @Autowired
    private UserApplicationService userApplicationService;;

    @GetMapping("/user")
    public String getSignUp(Model model) {

    }
}
