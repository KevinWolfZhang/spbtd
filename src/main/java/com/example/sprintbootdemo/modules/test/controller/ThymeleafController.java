package com.example.sprintbootdemo.modules.test.controller;

import com.example.sprintbootdemo.modules.test.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeleafController {

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("uid", "2344");
        model.addAttribute("name", "sss");
        model.addAttribute("job","<span style='color:red'>IT</span>");
        return "show";
    }

    @RequestMapping(value = "personShow", method = RequestMethod.GET)
    public String personShow(Model model) {
        Person person = new Person();
        person.setName("qqq");
        person.setAge(22);
        person.setJob("cook");
        model.addAttribute("person", person);
        return "message/person_show";
    }
}
