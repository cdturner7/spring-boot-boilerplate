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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping({"", "/"})
public class IndexController extends BaseController {

    @GetMapping
    public String displayHomepage(Model model) {
        model.addAttribute("username", "Collin");
        return "index";
    }

}
