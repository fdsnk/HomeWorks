package pro.sky.course2.lesson3.animals;

import pro.sky.course2.lesson3.Validate_String;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(this.name + " спит...");
    }

    public abstract void go();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
