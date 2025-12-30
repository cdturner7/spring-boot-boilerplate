/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

class ThemeManager {

    constructor() {
        this.html = document.documentElement;
        this.themeToggle = document.getElementById('themeToggle');
        this.themeIcon = document.getElementById('themeIcon');

        this.icons = {
            sun: '<path d="M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z"/>',
            moon: '<path d="M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z"/>'
        };

        this.init();
    }

    init() {
        // Apply initial theme
        this.applyTheme(this.getUsersPreferredTheme());

        // Set up event listener
        if (this.themeToggle) {
            this.themeToggle.addEventListener('click', () => this.toggleTheme());
        }
    }

    getUsersPreferredTheme() {
        // If user has explicitly set a theme
        if (localStorage.theme === "light" || localStorage.theme === "dark") {
            return localStorage.theme;
        }
        // Fall back to system preference
        return window.matchMedia("(prefers-color-scheme: dark)").matches ? "dark" : "light";
    }

    applyTheme(theme) {
        if (theme === 'dark') {
            this.html.classList.add('dark');
            this.updateIcon('sun');
        } else {
            this.html.classList.remove('dark');
            this.updateIcon('moon');
        }
        localStorage.setItem('theme', theme);
    }

    toggleTheme() {
        const currentTheme = this.html.classList.contains('dark') ? 'dark' : 'light';
        const newTheme = currentTheme === 'dark' ? 'light' : 'dark';
        this.applyTheme(newTheme);
    }

    updateIcon(iconType) {
        if (this.themeIcon) {
            this.themeIcon.innerHTML = this.icons[iconType];
        }
    }

    removeTheme() {
        localStorage.removeItem('theme');
        this.applyTheme(this.getUsersPreferredTheme());
    }
}

// Initialize when DOM is ready
document.addEventListener('DOMContentLoaded', () => {
    window.themeManager = new ThemeManager();
});