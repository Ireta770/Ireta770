package com.LMS.LMS.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LMS {

        @GetMapping("/saludo/{nombre}")
        public String saludo(@PathVariable String nombre) {
            return "Hola " + nombre + ", bienvenido a Spring Boot";
        }
    }


