package com.jdiai.site;

import com.jdiai.DataList;
import com.jdiai.WebPage;
import com.jdiai.annotations.UI;
import com.jdiai.entities.SearchItem;

public class SearchPage extends WebPage {
    @UI("#search-results li")
    public DataList<SearchItem> searchData;

}
