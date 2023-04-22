package com.dependencyinjection.dependencyinjection.common.coaches;

import com.dependencyinjection.dependencyinjection.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling 2101 times";
    }
    @PostConstruct
    public void onInit() {
        System.out.println("OnInit lifecycle");
    }
    @PreDestroy
    public void onDestroy() {
        System.out.println("onDestroy lifecycle");
    }
}
