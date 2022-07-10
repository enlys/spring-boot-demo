package com.example.controller;

import com.example.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {

    @Value("${username}")
    private String username;

    @Autowired
    private DataSource dataSource;

    @GetMapping("{id}")
    public String getString(@PathVariable Integer id) {
        System.out.println("hello >>>" + id);
        System.out.printf("username"+username);

        System.out.println("datasource"+dataSource);
        return "hello " + id;
    }
}
