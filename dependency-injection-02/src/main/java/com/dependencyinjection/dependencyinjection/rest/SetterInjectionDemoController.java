package com.dependencyinjection.dependencyinjection.rest;

import com.dependencyinjection.dependencyinjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterInjectionDemoController {
    private Coach _optionalCoach;
    @Autowired
    public void setOptionalCoach(@Qualifier("cricketCoach") Coach optionalCoach) {
        _optionalCoach = optionalCoach;
    }
    @GetMapping("/optional-coach")
    public String setterInjectionDemoEndpoint() {
        if (_optionalCoach == null) return "banana";
        return _optionalCoach.getDailyWorkout();
    }
}
