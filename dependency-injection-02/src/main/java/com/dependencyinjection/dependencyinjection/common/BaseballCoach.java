package com.dependencyinjection.dependencyinjection.common;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "I'm a baseball coach";
    }
}
