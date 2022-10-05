public class Author {

    public String firstName;
    public String secondName;

    public Author(String name, String surname) {
        this.firstName = name;
        this.secondName = surname;  
    }

    public String getFirstname() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

}
