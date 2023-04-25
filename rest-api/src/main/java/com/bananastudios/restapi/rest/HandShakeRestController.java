package com.bananastudios.restapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handshake")
public class HandShakeRestController {
    @GetMapping("/hello")
    public String helloHandshake() {
        return "Hello there";
    }
}
