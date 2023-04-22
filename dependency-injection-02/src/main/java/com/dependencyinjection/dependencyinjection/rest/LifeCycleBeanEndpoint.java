package com.dependencyinjection.dependencyinjection.rest;

import com.dependencyinjection.dependencyinjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifeCycleBeanEndpoint {
    private Coach _coach;
    @Autowired
    LifeCycleBeanEndpoint(
            Coach coach
    ) {
        _coach = coach;
    }
    @GetMapping("/coach-order-cycle")
    public String coachOrder() {
        return "default coach order";
    }
}
