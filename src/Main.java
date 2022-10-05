public class Main {

    public static void main(String[] args) {

        Author JamesJoes = new Author("James", "Joes");
        Author StevenHoking = new Author("Steven", "Hoking");

        Book Uliss = new Book("Uliss", JamesJoes, 1920);
        Book shortStoryTime = new Book("shortStoryTime", StevenHoking, 2010);

        Uliss.printBook();
        shortStoryTime.printBook();

        shortStoryTime.setAgeBook(2011);
        shortStoryTime.printBook();
    }
}