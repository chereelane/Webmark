package com.zell.webmark.dao;

/*
Fetches the webmark data from the datastore
 */

import com.zell.webmark.DataStore;
import com.zell.webmark.categories.UserWebmark;
import com.zell.webmark.categories.Webmark;

import javax.xml.crypto.Data;

public class WebmarkDao {
    public Webmark[][] getWebmarks() {
        return DataStore.getWebmarks();
    }

    public void saveUserWebmark(UserWebmark userWebmark) {
        DataStore.add(userWebmark);
    }
}
