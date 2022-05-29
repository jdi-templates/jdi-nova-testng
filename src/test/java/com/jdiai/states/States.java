package com.jdiai.states;

import org.openqa.selenium.Cookie;

import static com.jdiai.JDI.*;
import static com.jdiai.JDISite.homePage;

public class States {
    public static void logout() {
        driver().manage().deleteAllCookies();
        driver().navigate().refresh();
    }

    public static void login() {
        driver().manage().addCookie(new Cookie("authUser", "true"));
        driver().navigate().refresh();
    }

    public static void atHomePage() {
        if (!getUrl().equals("https://jdi-testing.github.io/jdi-light/index.html")) {
            homePage.open();
        }
    }
}
