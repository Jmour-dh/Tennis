package com.devpro.tennis.service;

import com.devpro.tennis.ApplicationStatus;
import com.devpro.tennis.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public HealthCheck getApplicationStatus() {
        return new HealthCheck(ApplicationStatus.OK, "Welcome to Dyma Tennis!");
    }

}