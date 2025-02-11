package edu.deq4.spring_security_jwt.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/")
    public String getResource() {
        return "value";
    }
}
