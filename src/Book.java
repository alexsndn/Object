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
}
