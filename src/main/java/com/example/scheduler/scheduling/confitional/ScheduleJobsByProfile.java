package com.example.scheduler.scheduling.confitional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ScheduleJobsByProfile {

    @Bean
    @Profile("prod")
    public ScheduledJob scheduledJob() {
        return new ScheduledJob("@Profile");
    }
}