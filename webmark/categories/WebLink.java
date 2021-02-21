package com.zell.webmark.categories;

public class WebLink extends Webmark{
    private String url;
    private String host;

    // Getters and Setters


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "WebLink{" +
                "url='" + url + '\'' +
                ", host='" + host + '\'' +
                '}';
    }

    @Override
    public boolean isKidFriendlyEligible() {
        if (url.contains("porn") || getTitle().contains("porn")){
            return false;
        }

        return true;
    }
}
