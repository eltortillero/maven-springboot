package com.dependencyinjection.dependencyinjection.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 10 times around the field";
    }
}
