package skypro.java.course2.lesson3.animals;

public class Amphibians extends Animals {

    public Amphibians(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(" ест...");
    }

    @Override
    public void go() {
        System.out.println(" перемещаеться...");
    }
}
