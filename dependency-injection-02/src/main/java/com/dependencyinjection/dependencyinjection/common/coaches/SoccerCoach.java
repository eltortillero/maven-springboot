package com.dependencyinjection.dependencyinjection.common.coaches;

import com.dependencyinjection.dependencyinjection.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
