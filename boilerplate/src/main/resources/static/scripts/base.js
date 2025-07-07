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

        // resize box shadows
        $(".convex-neuo").each((index, element) => {
            this.updateBoxShadow(element);
            this.updateBorderRadius(element);
        });

        // keep buttons active if they are clicked
        $(".keep-active").on("click", function () {
            $(this).toggleClass("active");
        });

    }

    // update the elements box shadow as needed
    updateBoxShadow(element) {
        // calculate the spread and blur from the elements width
        let elementWidth = element.offsetWidth;
        let spread = Math.round(elementWidth * 0.05);
        let blur = Math.round(elementWidth * 0.1);
        // override and set the new boxshadow values for the element
        element.style.boxShadow = `${spread}px ${spread}px ${blur}px var(--color-gray-300), -${spread}px -${spread}px ${blur}px var(--color-white)`;
    }

    // update the elements box shadow as needed
    updateBorderRadius(element) {
        // calculate the spread and blur from the elements width
        let elementWidth = element.offsetWidth;
        let radius = Math.round(elementWidth * 0.2);
        // override and set the border radius
        element.style.borderRadius = `${radius}px`;
    }
}

// Initialize the Base class when the document is ready
$(document).ready(() => {
    new Base();
});