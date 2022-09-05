public class Author {
    private String firstName;
    private String surName;

    @Override
    public String toString() {
        return "автор: " + firstName +" " + surName + ", ";
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
