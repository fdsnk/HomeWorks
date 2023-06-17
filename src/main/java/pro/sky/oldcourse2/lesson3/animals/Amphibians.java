package pro.sky.oldcourse2.lesson3.animals;

import pro.sky.oldcourse2.lesson3.Validate_String;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public void hunting() {
        System.out.println(getName() + " охотится");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validate_String.validateString(livingEnvironment);
    }

    @Override
    public String toString() {
        return '\n' + "Животное: " + getName()  + '\n' +
                "Возраст: " + getAge() + " лет" + '\n' +
                "Класс: Земноводные" + '\n' +
                "Среда обитания:" + getLivingEnvironment();
    }
}
