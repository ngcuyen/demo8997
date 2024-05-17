package com.lab1.demo8997.controllers;

import com.lab1.demo8997.entities.User;
import jakarta.validation.constraints.NotNull;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {
    @PostMapping("/login")
    public String login(@ModelAttribute("user") @NotNull User user, Model model){
        if(user.getUsername().isEmpty() || user.getPassword().isEmpty()){
            model.addAttribute("error","Username and password are required");
            return  "index";
        }
//        if(LoginService.login(user.getUsername(), user.getPassword()){
//            model.addAttribute("error","Username and password are required");
//            return  "index";
//        }
        model.addAttribute("error","Invalid username and password");
        return  "index";
    }

}
