import java.util.Objects;

public class Author {
    private String firstName;
    private String surName;

    @Override
    public String toString() {
        return "Автор: " + firstName +" " + surName + ". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName);
    }

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
}
