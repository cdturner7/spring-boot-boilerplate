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

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.cgwd.boilerplate.ui.Link;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "app.header")
public class HeaderLinksConfig {
    
    private List<Link> links;

}
