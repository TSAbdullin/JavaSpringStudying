package com.example.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Привет, Спринг!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name;
    }

}