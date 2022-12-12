package skypro.java.course2.lesson3.animals;

import skypro.java.course2.lesson3.Validate_String;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validate_String.validateString(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (Math.max(age, 0));
    }
}
