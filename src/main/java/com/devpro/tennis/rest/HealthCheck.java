package com.devpro.tennis.rest;

public record HealthCheck(ApplicationStatus status, String message) {
}