package ch.hszt.hs_2011.aud.exercise_05;

import java.util.*;

/**
 * An abstract class representing a book. Inherit it and complete with equals,
 * hashCode, toString and compareTo methods.
 *
 * The contents of the class are consciously 'imperfect', to represent more of
 * a real-world scenario and to make you think more carefully :-)
 */
public abstract class Task2 implements Comparable<Task2> {

    private Author[] authors;
    private String title;
    private String isbn;
    private String publisher;
    private Date dateOfPublication;
    private double price;

    /*
     * Use this constructor in your implementing class by calling
     * super(authors, title, ...).
     */
    public Task2(Author[] authors,
                     String title,
                     String isbn,
                     String publisher,
                     Date dateOfPublication,
                     double price)
            throws NullPointerException {

        /* Check and adopt parameters. */
        if (authors == null) {
            throw new NullPointerException
                    ("Parameter \"authors\" is null.");
        }
        if (title == null) {
            throw new NullPointerException
                    ("Parameter \"title\" is null.");
        }
        if (isbn == null) {
            throw new NullPointerException
                    ("Parameter \"isbn\" is null.");
        }
        if (publisher == null) {
            throw new NullPointerException
                    ("Parameter \"publisher\" is null.");
        }
        if (dateOfPublication == null) {
            throw new NullPointerException
                    ("Parameter \"dateOfPublication\" is null.");
        }
        this.authors = authors;
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
    }

    public abstract boolean equals(Object object);

    public abstract int hashCode();

    public abstract String toString();

    public abstract int compareTo(Task2 task4Book);

    public Author[] getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public static class Author {

        private String firstName;

        private String lastName;

        public Author(String firstName, String lastName)
                throws NullPointerException {

            /* Check and adopt parameters. */
            if (firstName == null) {
                throw new NullPointerException
                        ("Parameter \"firstName\" is null.");
            }
            if (lastName == null) {
                throw new NullPointerException
                        ("Parameter \"lastName\" is null.");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
