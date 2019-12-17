package com.example.sprintbootdemo.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/returnhtml")
public class ReturnHtmlController {

    @RequestMapping("/get")
    public String get() {
        return "index";
    }

    @RequestMapping("/move")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("key", "this is a html in templates");
        return modelAndView;
    }

    @RequestMapping("tostatic")
    public String toStatic() {
        return "redirect:/index.html";
    }
}
