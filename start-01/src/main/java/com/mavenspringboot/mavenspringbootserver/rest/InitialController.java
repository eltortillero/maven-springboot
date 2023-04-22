package com.mavenspringboot.mavenspringbootserver.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {
    @Value("${application.version}")
    private String version;
    @GetMapping("/")
    public String handShake() {
        return "<h1>Handshake was successful again!!!<h1>";
    }
    @GetMapping("/endpoint-test")
    public String testEndpoint() {
        return this.version;
    }
}
