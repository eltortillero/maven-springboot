package com.dependencyinjection.dependencyinjection.rest;

import com.dependencyinjection.dependencyinjection.common.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultipleBeans {
    private Coach myCoach;
    private Coach extraCoach;

    MultipleBeans(
            @Qualifier("cricketCoach") Coach mainCoach,
            @Qualifier("soccerCoach") Coach secondCoach
    ) {
        myCoach = mainCoach;
        extraCoach = secondCoach;
    }

    @GetMapping("coach-order")
    public String coachOrder() {
        return "coach order";
    }
}
