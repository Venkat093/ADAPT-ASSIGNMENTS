package com.example.demo32;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeReaource
{
    @GetMapping("/")
    public String Home()
    {
        return ("<h1>welcome</h1>");
    }
}