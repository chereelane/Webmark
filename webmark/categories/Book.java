package com.zell.webmark.categories;

import java.util.Arrays;

/*
 * This class describes properties of the Books found online
 **/
public class Book extends Webmark{
    private int publication;
    private String publisher;
    private String [] authors; // Will contain a list of people
    private String genre;
    private double amazonRating; //Will be pulled from Amazon.com

    // Getters and Setters


    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publication=" + publication +
                ", publisher='" + publisher + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", genre='" + genre + '\'' +
                ", amazonRating=" + amazonRating +
                '}';
    }

    @Override
    public boolean isKidFriendlyEligible() {
        return false;
    }
}
