package skypro.java.course2.lesson6.drivers;

import skypro.java.course2.lesson6.Validate_String;
import skypro.java.course2.lesson6.exceptions.NoLicenseException;
import skypro.java.course2.lesson6.transport.Transport;

public abstract class Driver {
    private String name;
    private boolean license;
    private int experience;

    public Driver(String name, boolean license, int experience) throws NoLicenseException{
        this.name = Validate_String.validateString(name);
        this.license = validateLicense(license);
        setExperience(experience);
    }

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

    public abstract void start();

    public abstract void stop();

    public abstract void refuelTheCar();

    public static Boolean validateLicense(Boolean value) throws NoLicenseException {
        if (value == null || !value) {
            throw new NoLicenseException("Не указана лицензия!");
        }
        return value;
    }

    @Override
    public String toString() {
        return "Водитель: " + getName() +
                ", наличие прав " + getLicense() +
                ", опыт " + getExperience() +
                " лет";
    }
}
