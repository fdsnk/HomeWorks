package skypro.java.course2.lesson4.drivers;

import skypro.java.course2.lesson4.Validate_String;
import skypro.java.course2.lesson4.transport.Transport;

public class Driver {
    private String name;
    private String license;
    private int experience;

    public Driver(String name, String license, int experience) {
        this.name = Validate_String.validateString(name);
        setLicense(license);
        setExperience(experience);
    }

    public void drive(Transport car) {
        System.out.println("Водитель " + getName() + " с категорией '" + getLicense() + "' может управлять автомобилем: " + car.getBrand() +
                " " + car.getModel());
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить движение");
    }

    public void refuelTheCar() {
        System.out.println("Заправить авто");
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = Validate_String.validateString(license);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = (experience >= 0 ? experience : 1);
    }
}
