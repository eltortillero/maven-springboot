package com.dependencyinjection.dependencyinjection.common;

//import org.springframework.stereotype.Component;

//@Component
public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 10 time around the field";
    }
}
