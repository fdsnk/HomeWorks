package pro.sky.course2.lesson4.drivers;

import pro.sky.course2.lesson4.transport.Bus;

public class DriverD<D extends Bus> extends Driver {
    public DriverD(String name, boolean license, int experience) {
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
    public void toStringForStart(D car) {
        System.out.printf("Водитель: %s, автомобиль %s %s, будет участвовать в заезде\n", getName(),
                car.getBrand(), car.getModel());
    }
}
