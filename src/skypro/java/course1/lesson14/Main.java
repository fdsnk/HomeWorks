package skypro.java.course1.lesson14;

public class Main {

    public static void main(String[] args) {
        Author sierra = new Author("Kathy", "Sierra");
        Book headFirstJava = new Book("Head First Java", sierra, 2010);
        System.out.println(headFirstJava);

        System.out.println();

        Author eckel = new Author("Bruce", "Eckel");
        Book thePhilosophyOfJava = new Book("The Philosophy of Java", eckel, 2022);

        System.out.println(thePhilosophyOfJava);
        System.out.println();
        Author eckel2 = new Author("Bruce", "Eckel");
        Book thePhilosophyOfJava2 = new Book("The Philosophy of Java", eckel, 2022);
        System.out.println();
        System.out.println(thePhilosophyOfJava2);
        System.out.println();
        System.out.println(thePhilosophyOfJava);
        System.out.println();

        // проверка

        System.out.println(thePhilosophyOfJava2.equals(thePhilosophyOfJava));
        System.out.println(thePhilosophyOfJava.hashCode());
        System.out.println(thePhilosophyOfJava2.hashCode());
    }
}