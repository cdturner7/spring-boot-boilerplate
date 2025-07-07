/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.controller.advice;

import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cgwd.boilerplate.config.HeaderLinksConfig;
import com.cgwd.boilerplate.ui.Link;

@ControllerAdvice
public class GlobalModelAttributes {

    private final HeaderLinksConfig headerLinks;

    public GlobalModelAttributes(HeaderLinksConfig headerLinks) {
        this.headerLinks = headerLinks;
    }

    @ModelAttribute("headerLinks")
    public List<Link> headerLinks() {
        return headerLinks.getLinks();
    }
}

