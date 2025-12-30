/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.cgwd.boilerplate.utils.TemplateScanner;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/{viewName}")
public class FallbackViewController {

    private final TemplateScanner templateScanner;

    public FallbackViewController(TemplateScanner templateScanner) {
        this.templateScanner = templateScanner;
    }

    @GetMapping
    public String fallback(@PathVariable String viewName) throws Exception {
        // make sure we have the view before we display it
        if (templateScanner.templateExists(viewName)) {
            return viewName;
        }
        // couldnt find the view
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "View '" + viewName + "' not found");
    }
}
