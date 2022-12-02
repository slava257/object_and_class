package methods_objects;

import java.util.Objects;

public class Book {
    private String namesBook;
    private Author author;
    private int yearPublishing;

    public Book(String namesBook, Author author, int yearPublishing) {
        this.author = author;
        this.namesBook = namesBook;
        this.yearPublishing = yearPublishing;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.namesBook;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    public String toString() {
        return namesBook + " " + author + " " +yearPublishing;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book =(Book)other;
        return yearPublishing == book.yearPublishing && namesBook.equals(book.namesBook) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(namesBook, author, yearPublishing);
    }
}

