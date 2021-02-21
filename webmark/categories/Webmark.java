package com.zell.webmark.categories;

public abstract class Webmark {
    private long id;
    private String title;
    private String profileURL;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public abstract boolean isKidFriendlyEligible();

}
