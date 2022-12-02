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
}
