package com.jdiai.entities;

import com.jdiai.annotations.UI;
import com.jdiai.tools.DataClass;

public class LoginUser extends DataClass<LoginUser> {
    @UI public String name;
    @UI public String password;

}
