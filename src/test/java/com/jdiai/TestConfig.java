package com.jdiai;

import com.jdiai.jswraper.driver.DriverManager;
import com.jdiai.jswraper.driver.DriverOptions;
import com.jdiai.jswraper.driver.JDIDriver;
import com.jdiai.testng.JDIAllureListener;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import static com.jdiai.JDI.addListener;
import static com.jdiai.jswraper.driver.DriverTypes.CHROME;
import static com.jdiai.tools.TestIDLocators.ID_LOCATOR;
import static com.jdiai.tools.TestIDLocators.SMART_LOCATOR;

public interface TestConfig {
    static void setTestConfigurations() {
        addListener(new JDIAllureListener());
        // SMART_LOCATOR = ID_LOCATOR;
        // JDI.domain = "";
        // JDI.headless();
        // JDI.logAll();
        // JDI.logJDIActions();
        // JDI.browserSize = "1536x864";
        // JDI.maximizeBrowser();
        // JDI.trackStatistic();
        // JDI.openIn(CHROME);
        // JDI.alwaysShowElement();
        // DriverManager.useDriver(CHROME);
        // DriverManager.useDriver(() -> new FirefoxDriver());
        // JDIDriver.DRIVER_OPTIONS.common = (mutableCapabilities)
        //     -> mutableCapabilities.setCapability(ACCEPT_SSL_CERTS, true);
        // JDIDriver.DRIVER_OPTIONS.chrome = (chromeOptions)
        //     -> chromeOptions.setHeadless(true);
    }
}
