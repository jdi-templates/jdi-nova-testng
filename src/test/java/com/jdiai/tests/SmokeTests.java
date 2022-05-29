package com.jdiai.tests;

import com.jdiai.DataList;
import com.jdiai.TestInit;
import com.jdiai.entities.SearchItem;
import com.jdiai.testng.TestNGListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.jdiai.JDISite.*;
import static com.jdiai.asserts.Conditions.*;
import static com.jdiai.states.States.atHomePage;
import static com.jdiai.states.States.logout;
import static com.jdiai.test.data.PersonsData.Roman;
import static com.jdiai.test.data.PersonsData.Triss;
import static com.jdiai.test.data.SearchData.AllSearchResults;
import static com.jdiai.test.data.SearchData.SearchResults;
import static com.jdiai.tools.Alerts.validateAlertText;
import static com.jdiai.tools.PrintUtils.print;
import static org.testng.Assert.assertEquals;

@Listeners(TestNGListener.class)
public class SmokeTests implements TestInit {

    @BeforeMethod
    public void before() {
        logout();
        atHomePage();
        homePage.loginAs(Roman);
    }

    @Test
    public void submitEntity() {
        contactPage.open();
        contactPage.shouldBeOpened();
        contactPage.contactForm.submit(Triss);
        contactPage.lastNameInLog.should(have(text("Last Name: " + Triss.lastName)));
        contactPage.descriptionInLog.should(have(text("Description: " + Triss.description)));
    }

    @Test
    public void validateListOfEntities() {
        homePage.searchFor("jdi");
        searchPage.shouldBeOpened();
        DataList<SearchItem> results = searchPage.searchData;
        assertEquals(results.size(), 6);
        assertEquals(results.get("JDI TEST SITE").link, "https://jdi-testing.github.io/jdi-light/");
        assertEquals(print(results, SearchItem::toString), SearchResults);
        results.waitFor(size(s -> s > 6));
        assertEquals(results.size(), 8);
        assertEquals(print(results, SearchItem::toString), AllSearchResults);
        results.select(1);
        validateAlertText("JDI Owner contact-");
    }

}
