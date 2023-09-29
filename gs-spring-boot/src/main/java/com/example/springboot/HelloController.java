package com.example.springboot;

@RestController
public class HelloController {
    @GetMapping("/");
    public String index() {
        return "Greetings from Spring Boot";
    }
}
