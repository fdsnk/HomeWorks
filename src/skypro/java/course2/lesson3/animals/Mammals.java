package skypro.java.course2.lesson3.animals;

import skypro.java.course2.lesson3.Validate_String;

public class Mammals extends Animals {
    private String livingEnvironment;
    private int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validate_String.validateString(livingEnvironment);
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = (movementSpeed > 0 ? movementSpeed : 1);
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
