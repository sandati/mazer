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
public class ComponentsController {
    @RequestMapping(value = "/components/accordion", method = RequestMethod.GET)
    public String accordion(ModelMap map) {
        return "accordion";
    }
    
    @RequestMapping(value = "/components/alert", method = RequestMethod.GET)
    public String alert(ModelMap map) {
        return "alert";
    }
    
    @RequestMapping(value = "/badge", method = RequestMethod.GET)
    public String badge(ModelMap map) {
        return "badge";
    }
    
    @RequestMapping(value = "/breadcrumb", method = RequestMethod.GET)
    public String breadcrumb(ModelMap map) {
        return "breadcrumb";
    }
    
    @RequestMapping(value = "/button", method = RequestMethod.GET)
    public String button(ModelMap map) {
        return "button";
    }
}
