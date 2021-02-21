package com.zell.webmark.categories;
/*
   The purpose of this class is to retrieve user and bookmark information
   Uses getter and setter methods and retrieves the information User and Webmark classes
 */

// Maintains the relationship between  a user and a webmark.
public class UserWebmark {
    private User user;
    private Webmark webmark;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Webmark getWebmark() {
        return webmark;
    }

    public void setWebmark(Webmark webmark) {
        this.webmark = webmark;
    }
}
