package com.jdiai.site;

import com.jdiai.JS;
import com.jdiai.WebPage;
import com.jdiai.annotations.UI;
import com.jdiai.custom.ContactForm;

public class ContactPage extends WebPage {
    @UI(".lname-res")
    public JS lastNameInLog;
    @UI(".descr-res")
    public JS descriptionInLog;
    @UI public JS contactForm;

    @UI("#contact-form")
    public ContactForm contacts;

}
