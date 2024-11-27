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
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap map) {
        return "home";
    }
    
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashbord(ModelMap map) {
        return "dashboard";
    }
}
