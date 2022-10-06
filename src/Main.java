public class Main {

    public static void main(String[] args) {

        Author jamesJoes = new Author("James", "Joes");
        Author stevenHoking = new Author("Steven", "Hoking");

        Book uliss = new Book("Uliss", jamesJoes, 1920);
        Book shortStoryTime = new Book("shortStoryTime", stevenHoking, 2010);

        System.out.println(uliss);
        System.out.println(shortStoryTime);

        shortStoryTime.setAgeBook(2011);

        System.out.println(shortStoryTime);

        System.out.println(uliss.equals(shortStoryTime));

        System.out.println(uliss.hashCode());
        System.out.println(shortStoryTime.hashCode());


    }
}