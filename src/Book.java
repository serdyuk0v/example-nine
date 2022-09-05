public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    @Override
    public String toString() {
        return "Книга - " + bookName + ". " + author + "Дата публикации: " + publishYear;
    }

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
