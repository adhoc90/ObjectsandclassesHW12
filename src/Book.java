import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private Integer publishingYear;

    public Book(String title, Author author, Integer publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;

    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publishingYear, book.publishingYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }

    @Override
    public String toString() {
        return author.toString() + ". Кинга: " + this.title + ". Год публикации: " + this.publishingYear;
    }
}
