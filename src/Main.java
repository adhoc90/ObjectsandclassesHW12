public class Main {
    private static final Author[] authors = new Author[2];
    private static final Book[] books = new Book[2];

    public static void main(String[] args) {

        authors[0] = new Author("Брюс", "Эккель");
        authors[1] = new Author("Роберт", "Мартин");

        books[0] = new Book("Философия java", authors[0], 2017);
        books[1] = new Book("Чистый код", authors[1], 2021);

        books[0].setPublishingYear(2020);
        printAuthors();
        System.out.println();
        printBooks();
    }

    public static void printAuthors() {
        for (int i = 0; i < authors.length; i++) {
            System.out.println(authors[i]);
        }
    }

    public static void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}