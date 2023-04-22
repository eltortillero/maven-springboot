package com.dependencyinjection.dependencyinjection.common.coaches;

import com.dependencyinjection.dependencyinjection.common.Coach;

public class GenericCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "I haven't completed school";
    }
}
