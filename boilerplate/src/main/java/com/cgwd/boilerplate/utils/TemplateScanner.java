/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TemplateScanner {

    @Value("classpath:/templates/**/*.html")
    private Resource[] templates;

    private final List<String> viewNames = new ArrayList<>();

    @PostConstruct
    public void scanTemplates() throws IOException {
        for (Resource resource : templates) {
            String path = resource.getURI().toString();
            if (path.contains("/templates/")) {
                String view = path.substring(path.indexOf("/templates/") + 10);
                view = view.replace(".html", "").replaceAll("^/", "");
                viewNames.add(view);
            }
        }
    }

    public boolean templateExists(String viewName) {
        return viewNames.contains(viewName);
    }

    public List<String> getAllViewNames() {
        return viewNames;
    }
}

