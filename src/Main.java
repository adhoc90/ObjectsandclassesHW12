public class Main {
    public static void main(String[] args) {

        Author ekkel = new Author("Брюс", "Эккель");
        Author martin = new Author("Роберт", "Мартин");

        Book javaPhilosophy = new Book("Философия java", ekkel, 2017);
        Book cleanCode = new Book("Чистый код", martin, 2021);

        javaPhilosophy.setPublishingYear(2020);
        System.out.println(javaPhilosophy.getTitle() + " " + javaPhilosophy.getAuthor() + " " + javaPhilosophy.
                getPublishingYear());
    }
}