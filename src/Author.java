public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    private String getAuthorName() {
        return this.authorName;
    }

    private String getAuthorSurname() {
        return this.authorSurname;
    }

    public void setAuthorName() {
        this.authorName = authorName;
    }

    public void setAuthorSurname() {
        this.authorSurname = authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }
}
