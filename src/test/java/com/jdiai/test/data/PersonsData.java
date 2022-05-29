package com.jdiai.test.data;

import com.jdiai.entities.Contacts;
import com.jdiai.entities.User;

public class PersonsData {
    public static User Roman = new User().set(
            u -> {u.name = "Roman"; u.password = "Jdi1234"; });

    public static Contacts Triss = new Contacts().set(u -> {
        u.name = "Triss";
        u.lastName = "Merigold";
        u.description = "Triss Merigold of Maribor was a legendary Temerian sorceress of the 13th century. Called Fourteenth of the Hill by her contemporaries because she was erroneously thought to have been killed during the Battle of Sodden Hill, she passed into history as Merigold the Fearless.";
        u.gender = "Female";
        u.religion = "Agnostic";
        u.hasPassport = true;
    });

}
