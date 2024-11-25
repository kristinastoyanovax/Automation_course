/*
Create a class named Movie that has three attributes: title, genre, and
rating. Use this class to create different movie objects, each with its own
title, genre, and rating. Display the details of each movie by accessing
these attributes.
 */
public class Movie {
    String title;
    String genre;
    float rating;

    @Override
    public String toString() {
        return "The movie " + title + " is " + genre + " and has a rating of: " + rating;
    }

    public Movie(String title, String genre, float rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
}
