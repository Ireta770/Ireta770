package com.example.LiteThinking.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LMS {

        @GetMapping("/saludo/{name}")
        public String saludo(@PathVariable String name) {
            return "Hola " + name + ", bienvenido a Spring Boot";
        }
    }
