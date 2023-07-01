package com.praxy.springbootconfig.controller;

import com.praxy.springbootconfig.controller.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Value("${my.greeting}")
    private String message;
    @Value("${my.list}")
    private List<String> customList;

    @Autowired
    private Person person;

    @GetMapping("/message")
    public String getMessage() {
        //return "From File: "+ message + "\n List from file" + customList;
        return person.toString();
    }
}
