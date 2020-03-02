package by.htp.library.bean;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String yearOfPublishing;
    private int numberOfPages;
    private String genre;

    public Book(String title, String author, String yearOfPublishing, int numberOfPages, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                yearOfPublishing.equals(book.yearOfPublishing) &&
                genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublishing, numberOfPages, genre);
    }
}
