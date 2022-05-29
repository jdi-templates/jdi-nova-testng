package com.jdiai.entities;

import com.jdiai.annotations.UI;
import com.jdiai.tools.DataClass;

public class Contacts extends DataClass<Contacts> {
    @UI("#first-name") public String name;
    @UI public String lastName;
    @UI public String description;
    @UI public String gender;
    @UI("#religion-options") public String religion;
    @UI("#passport") public Boolean hasPassport;

}
