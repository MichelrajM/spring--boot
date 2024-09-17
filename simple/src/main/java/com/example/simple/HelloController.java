package com.example.simple;

import org.simplegframework.web.bind.annotation.GetMapping;
import org.simpleframework.web.bind.annotation.RequestMapping;
import org.simpleframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping
    public String getMessage(){
        return "Welcome to SpringBoot Docker";
    }
}
