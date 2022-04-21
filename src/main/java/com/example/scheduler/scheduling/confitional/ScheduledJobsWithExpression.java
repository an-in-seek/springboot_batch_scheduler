package com.example.scheduler.scheduling.confitional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Configuration
public class ScheduledJobsWithExpression {

    /**
     * A scheduled job controlled via application property. The job always
     * executes, but the logic inside is protected by a configurable boolean
     * flag.
     */
    @Scheduled(cron = "${jobs.cronSchedule:-}")
    public void cleanTempDirectory() {
        log.info("Cleaning temp directory via placeholder");
    }
}