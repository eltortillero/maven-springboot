package com.dependencyinjection.dependencyinjection.rest;

import com.dependencyinjection.dependencyinjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach _myCoach;
    @Autowired
    public DemoController(
        @Qualifier("soccerCoach") Coach coach
    ) {
        _myCoach = coach;
    }
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return _myCoach.getDailyWorkout();
    }
}
