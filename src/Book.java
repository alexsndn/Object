public class Book {

    private String bookName;
    private String bookAuthor;
    private int ageBook;

    public Book(String bookName, String bookAuthor, int ageBook) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ageBook = ageBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public int getAgeBook() {
        return this.ageBook;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }

}
