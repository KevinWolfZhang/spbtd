package com.example.sprintbootdemo.modules.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/resource")
public class TestController {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${job}")
    private String job;

    @Value("${content}")
    private String content;

    @GetMapping("/hello")
    public String printString() {
        return "姓名:" + name + "年龄:" + age + "职业:" + job + "/br" + content;
    }
}
