package com.jdiai;

import com.jdiai.testng.JDIAllureListener;

import static com.jdiai.JDI.addListener;
import static com.jdiai.tools.TestIDLocators.ID_LOCATOR;
import static com.jdiai.tools.TestIDLocators.SMART_LOCATOR;

public interface TestConfig {
    static void setTestConfigurations() {
        SMART_LOCATOR = ID_LOCATOR;
        addListener(new JDIAllureListener());
        // JDI.domain = "";
        // JDI.headless();
        // JDI.logAll();
        // JDI.logJDIActions();
        // JDI.browserSize = "1536x864";
        // JDI.maximizeBrowser();
        // JDI.trackStatistic();
        // JDI.openIn(CHROME);
        // JDI.alwaysShowElement();
    }
}
