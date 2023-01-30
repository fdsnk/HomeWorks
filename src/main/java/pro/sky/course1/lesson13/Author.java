package pro.sky.course1.lesson13;

public class Author {
    private String firstName;
    private String lastName;
    private String fullName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return this.fullName;
    }
}
