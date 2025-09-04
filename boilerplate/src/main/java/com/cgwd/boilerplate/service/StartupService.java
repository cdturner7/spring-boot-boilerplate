/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Service
public class StartupService extends BaseService implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("=== Application Startup Service ===");

        // print startup time
        LocalDateTime now = LocalDateTime.now();
        log.info("Application started at: {}", now);

        // Do any other startup logic
        log.info("Startup tasks completed.");
    }

}

