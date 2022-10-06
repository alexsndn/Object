import java.util.Objects;

public class Author {

    private String firstName;
    private String secondName;

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

    public String toString() {
        return this.firstName + " "+ this.secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}
