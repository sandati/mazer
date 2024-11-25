/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mazerproject.mazer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author yahaya
 */
@Controller
public class AuthentificationController {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(ModelMap map) {
        return "register";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap map) {
        return "login";
    }
    
    @RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
    public String forgotPassword(ModelMap map) {
        return "forgot-password";
    }
}
