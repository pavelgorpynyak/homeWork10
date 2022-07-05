public class Main {
    public static void main(String[] args) {
            Book book1 = new Book("Voina i mir", 1869,new Author("Lev", "Tolstoy"));
        Book book3 = new Book("Voina i mir", 1869, new Author("Lev", "Tolstoy"));

        System.out.println(book1);

            book1.setYearOfPublishing(2001);
            System.out.println("book1.getYearOfPublishing() = " + book1.getYearOfPublishing());

            Book book2 = new Book("Igra prestolov", 2001, new Author("George", "Martin"));

        System.out.println(book1);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());

    }
}