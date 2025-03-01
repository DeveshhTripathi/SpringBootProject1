package com.example.SpringProject_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping({"", "/", "/home"})
    public String sayHello() {
        return "Hello from Bridege Labz!";
    }
}
