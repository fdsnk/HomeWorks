package skypro.java.course1.lesson13;

public class Book {

    private String name;
    private Author fullName;
    private int yearPublishing;

    public Book(String name, Author fullName, int yearPublishing) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.fullName = fullName;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthorName() {
        return this.fullName.getFullName();
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
