import java.util.Objects;

public class Book {
    private String bookName;
    private int yearOfPublishing;
    private final Author author;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearOfPublishing() == book.getYearOfPublishing() && getBookName().equals(book.getBookName()) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getYearOfPublishing(), author);
    }

    public Book(String bookName, int yearOfPublishing, Author author) {
        this.bookName = bookName;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return bookName + " " + yearOfPublishing + " " + author;
    }
}
