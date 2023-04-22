package com.dependencyinjection.dependencyinjection.rest;

import com.dependencyinjection.dependencyinjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoQualifierNotationInjection {
    private Coach _coach;
    @Autowired
    NoQualifierNotationInjection(
            Coach _injectedCoach
    ){
        _coach = _injectedCoach;
    }
    @GetMapping("/no-qualifier")
    public String coachMessage() {
        return _coach.getDailyWorkout();
    }
}
