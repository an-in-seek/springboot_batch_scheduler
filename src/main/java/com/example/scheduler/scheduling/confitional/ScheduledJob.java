package com.example.scheduler.scheduling.confitional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@RequiredArgsConstructor
public class ScheduledJob {

    private final String source;

    @Scheduled(fixedDelay = 60000)
    public void cleanTempDir() {
        log.info("Cleaning temp directory via {}", source);
    }
}