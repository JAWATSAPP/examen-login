/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.login.controller;

import com.example.login.modelo.User;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author FLHORIAN
 */
@Controller
public class LoginControleler {

    @GetMapping("/login")
    public String LoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";

    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute User user, Model model) {
        if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
            return "success";
        } else {
            model.addAttribute("error", "Has Olvidado tu Cuenta?");
            return "login";

        }
    }

}
