package com.jdiai;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.jdiai.JDI.openSite;
import static com.jdiai.TestConfig.setTestConfigurations;
import static com.jdiai.jswraper.driver.DriverManager.killDrivers;

public interface TestInit {
    @BeforeSuite(alwaysRun = true)
    default void setUp() {
        killDrivers();
        setTestConfigurations();
        openSite("https://jdi-testing.github.io/jdi-light");
    }

    @AfterSuite(alwaysRun = true)
    default void tearDown() {
        killDrivers();
    }
}
