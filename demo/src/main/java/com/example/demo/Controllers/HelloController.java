package com.example.demo.Controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")

public class HelloController 
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello from Spring Boot!";
    }
}