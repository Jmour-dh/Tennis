package com.devpro.tennis.rest;

import com.devpro.tennis.HealthCheck;
import com.devpro.tennis.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping("/healthcheck")
    public HealthCheck healthcheck() {
        return healthCheckService.getApplicationStatus();
    }

}