package com.chen.controller;


import com.chen.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Autowired
    Person person;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }


    @RequestMapping("/person")
    public Person getPerson(){
        return person;

    }
}
