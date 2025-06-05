/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class ApplicationConfig {

    @Bean
    static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
