import java.util.Objects;

public class Book {

    public String bookName;
    public Author bookAuthor;
    public int ageBook;

    public Book(String bookName, Author bookAuthor, int ageBook) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ageBook = ageBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public String getAuthorFull() {
        return bookAuthor.getFirstname()+" "+bookAuthor.getSecondName();
    }

    public int getAgeBook() {
        return this.ageBook;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }

    public void printBook() {
        System.out.printf("%n Название:%s%n Автор:%s%n Год издания:%s%n",
                this.getBookName(),this.getAuthorFull(), this.getAgeBook());
    }

    public String toString() {
        return "book - "+this.bookName+" by "+ this.bookAuthor+" published in "+this.ageBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ageBook == book.ageBook && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, ageBook);
    }
}
