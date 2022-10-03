public class Main {

    public static void main(String[] args) {

        Book Uliss = new Book("Uliss", "James Joes", 1920);
        Book shortStoryTime = new Book("shortStoryTime", "Steven Hoking", 2010);

        System.out.println("Книга - " + Uliss.getBookName() + " Автор книги - " + Uliss.getBookAuthor() + " Дата выпуска - " + Uliss.getAgeBook());
        System.out.println("Книга - " + shortStoryTime.getBookName() + " Автор книги - " + shortStoryTime.getBookAuthor() + " Дата выпуска - " + shortStoryTime.getAgeBook());

        shortStoryTime.setAgeBook(2011);

        System.out.println(shortStoryTime.getAgeBook());

    }
}