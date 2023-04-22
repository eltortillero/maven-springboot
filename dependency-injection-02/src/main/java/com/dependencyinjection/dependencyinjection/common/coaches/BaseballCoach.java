package com.dependencyinjection.dependencyinjection.common.coaches;

import com.dependencyinjection.dependencyinjection.common.Coach;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "I'm a baseball coach";
    }
}
