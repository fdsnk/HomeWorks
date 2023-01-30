package pro.sky.course2.lesson6.drivers;

import pro.sky.course2.lesson6.exceptions.NoLicenseException;
import pro.sky.course2.lesson6.transport.Car;

public class DriverB<B extends Car> extends Driver {

    public DriverB(String name, boolean license, int experience) throws NoLicenseException {
        super(name, license, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель " + getName() + " стартовал");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getName() + " остановился");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель " + getName() + " стартовал");
    }

    public void toStringForStart(B car) {
        System.out.printf("Водитель: %s, автомобиль %s %s, будет участвовать в заезде\n", getName(),
                car.getBrand(), car.getModel());
    }
}
