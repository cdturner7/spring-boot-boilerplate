/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

class Base {

    constructor() {
        // setup button links
        $(".sandbox-page-button").click(() => {window.location = "/sandbox"});
    }

}

// Initialize the Base class when the document is ready
$(document).ready(() => {
    new Base();
});