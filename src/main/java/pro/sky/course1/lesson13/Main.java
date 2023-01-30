package pro.sky.course1.lesson13;

public class Main {

    public static void main(String[] args) {
        Author sierra = new Author("Kathy", "Sierra");
        Book headFirstJava = new Book("Head First Java", sierra, 2010);
        System.out.println("Название: " + headFirstJava.getName());
        System.out.println("Автор: " + headFirstJava.getAuthorName());
        headFirstJava.setYearPublishing(2012);
        System.out.println("Год: " + headFirstJava.getYearPublishing());

        System.out.println();

        Author eckel = new Author("Bruce", "Eckel");
        Book thePhilosophyOfJava = new Book("The Philosophy of Java", eckel, 2022);
        System.out.println("Название: " + thePhilosophyOfJava.getName());
        System.out.println("Автор: " + thePhilosophyOfJava.getAuthorName());
        System.out.println("Год: " + thePhilosophyOfJava.getYearPublishing());

    }
}
