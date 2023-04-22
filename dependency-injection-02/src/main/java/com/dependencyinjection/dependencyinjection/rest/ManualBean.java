package com.dependencyinjection.dependencyinjection.rest;

import com.dependencyinjection.dependencyinjection.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManualBean {
    private Coach _coach;

    @Autowired
    ManualBean(
            @Qualifier("customBeanId") Coach coach
    ) {
        _coach = coach;
    }
    @GetMapping("/manual-coach")
    public String manualCoachBean() {
        return _coach.getDailyWorkout();
    }
}
