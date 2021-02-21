package com.zell.webmark.controllers;

import com.zell.webmark.categories.User;
import com.zell.webmark.categories.Webmark;
import com.zell.webmark.managers.WebmarkManager;

public class WebmarkController {
    private static WebmarkController instance = new WebmarkController();
    private WebmarkController() {}

    public static WebmarkController getInstance() {
    return instance;
    }

    public void saveUserWebmark(User user, Webmark webmark){
        WebmarkManager.getInstance().saveUserWebmark(user, webmark);
    }
}
