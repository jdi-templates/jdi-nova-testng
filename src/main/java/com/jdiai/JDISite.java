package com.jdiai;

import com.jdiai.annotations.Site;
import com.jdiai.annotations.Url;
import com.jdiai.site.ContactPage;
import com.jdiai.site.HomePage;
import com.jdiai.site.SearchPage;

@Site("https://jdi-testing.github.io/jdi-light")
public class JDISite {
    @Url("/")
    public static HomePage homePage;
    @Url("/search.html")
    public static SearchPage searchPage;
    @Url("/contacts.html")
    public static ContactPage contactPage;
}
