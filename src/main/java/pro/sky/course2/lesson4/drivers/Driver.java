package pro.sky.course2.lesson4.drivers;

import pro.sky.course2.lesson4.Validate_String;
import pro.sky.course2.lesson4.transport.Transport;

public abstract class Driver {
    private String name;
    private boolean license;
    private int experience;

    public Driver(String name, boolean license, int experience) {
        this.name = Validate_String.validateString(name);
        setLicense(license);
        setExperience(experience);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void refuelTheCar();

    public String getName() {
        return name;
    }

    public boolean getLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = (experience >= 0 ? experience : 1);
    }

    @Override
    public String toString() {
        return "Водитель: " + getName() +
                ", наличие прав " + getLicense() +
                ", опыт " + getExperience() +
                " лет";
    }
}
