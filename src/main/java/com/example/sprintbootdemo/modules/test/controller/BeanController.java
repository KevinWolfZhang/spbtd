package com.example.sprintbootdemo.modules.test.controller;

import com.example.sprintbootdemo.modules.test.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bean")
public class BeanController {
    @Autowired
    private Person person;

    @GetMapping("/say")
    public String sayPerson() {
        return person.getContent();
    }
}
