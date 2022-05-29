package com.jdiai.site;

import com.jdiai.JS;
import com.jdiai.WebPage;
import com.jdiai.annotations.UI;
import com.jdiai.custom.LoginForm;
import com.jdiai.entities.User;

public class HomePage extends WebPage {
    @UI("#user-icon") public JS userIcon;
    @UI(".search-field input") public JS searchField;
    @UI(".icon-search") public JS searchIcon;
    public LoginForm loginForm;

    public void loginAs(User user) {
        userIcon.click();
        loginForm.loginAs(user);
    }

    public void searchFor(String text) {
        searchIcon.click();
        searchField.input(text);
        searchIcon.click();
    }
}
