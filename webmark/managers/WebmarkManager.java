package com.zell.webmark.managers;
// Manages webmark information

import com.zell.webmark.categories.Book;
import com.zell.webmark.categories.Movie;
import com.zell.webmark.categories.WebLink;

public class WebmarkManager {
    private static WebmarkManager instance = new WebmarkManager();
    private WebmarkManager() {}

    public static WebmarkManager getInstance() {
        return instance;
    }

    /**
     * Creates an movie instance
     * @param id
     * @param title
     * @param profileURL
     * @param releaseYear
     * @param cast
     * @param directors
     * @param genre
     * @param imdbRating
     * @return
     */
    public Movie createMovie (long id, String title, String profileURL, int releaseYear,
                              String [] cast, String [] directors, String genre, double imdbRating) {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileURL(profileURL);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);

        return movie;
    }

    /**
     *
     * @param id
     * @param title
     * @param publication
     * @param publisher
     * @param authors
     * @param genre
     * @param amazonRating
     * @return
     */
    public Book createBook (long id, String title, int publication,
                            String publisher, String [] authors, String genre, double amazonRating )
    {
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    /**
     *
     * @param id
     * @param title
     * @param url
     * @param host
     * @return
     */
    public WebLink createWebLink(long id, String title, String url, String host)
    {
        WebLink weblink = new WebLink();
        weblink.setId(id);
        weblink.setTitle(title);
        weblink.setUrl(url);
        weblink.setHost(host);

        return weblink;
    }
}
