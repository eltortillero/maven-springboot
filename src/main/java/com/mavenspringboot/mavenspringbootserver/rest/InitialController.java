package com.mavenspringboot.mavenspringbootserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {
    @GetMapping("/")
    public String handShake() {
        return "<h1>Handshake was successful<h1>";
    }
}
