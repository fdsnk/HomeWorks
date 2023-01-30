package pro.sky.course1.lesson14;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Название: " + name + '\n' +
                "Автор: " + fullName + '\n' +
                "Год: " + yearPublishing;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublishing);
    }
}
