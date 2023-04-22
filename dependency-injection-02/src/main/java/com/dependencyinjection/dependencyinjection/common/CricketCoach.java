package com.dependencyinjection.dependencyinjection.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling 2101 times";
    }
}
