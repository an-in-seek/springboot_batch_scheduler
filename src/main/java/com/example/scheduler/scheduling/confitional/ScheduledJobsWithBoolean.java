package com.example.scheduler.scheduling.confitional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Configuration
public class ScheduledJobsWithBoolean {

    @Value("${jobs.enabled:true}")
    private boolean isEnabled;

    /**
     * A scheduled job controlled via application property. The job always
     * executes, but the logic inside is protected by a configurable boolean
     * flag.
     */
    @Scheduled(fixedDelay = 60000)
    public void cleanTempDirectory() {
        if (isEnabled)
            log.info("Cleaning temp directory via boolean flag");
    }
}