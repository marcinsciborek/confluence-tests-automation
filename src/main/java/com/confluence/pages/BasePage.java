package com.confluence.pages;

import com.microsoft.playwright.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BasePage {
    private static Playwright playwright;
    private static Browser browser;
    final Page page;


    private void initialize() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    public void click(String selector) {
        page.click(selector);
    }

    public void fill(String selector, String text) {
        page.fill(selector, text);
    }

    public void close() {
        page.close();
    }

}
