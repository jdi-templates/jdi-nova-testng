package com.jdiai.tests;

import com.jdiai.TestInit;
import com.jdiai.testng.TestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.jdiai.JDI.*;

@Listeners(TestNGListener.class)
public class SmokeTests implements TestInit {

    @Test
    public void demoTest() {
        $("#user-icon").click();
        $("#name").input("Roman");
        $("#password").input("Jdi1234");
        $(".fa-sign-in").click();

        openPage("/contacts.html");
        urlShouldBe("/contacts.html");
    }

}
