package com.dependencyinjection.dependencyinjection.config;

import com.dependencyinjection.dependencyinjection.common.Coach;
import com.dependencyinjection.dependencyinjection.common.coaches.GenericCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachManager {
    @Bean
    public Coach genericCoach() {
        return new GenericCoach();
    }
    @Bean("customBeanId")
    public Coach customCoach() {
        return new GenericCoach();
    }
}
