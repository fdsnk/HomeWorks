package skypro.java.course2.lesson4.transport;

import skypro.java.course2.lesson4.Validate_String;

public class Truck extends Transport implements Competing{


    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void go() {
        System.out.printf("%s %s - Поехали! \n", getBrand(), getModel());
    }

    @Override
    public void stop() {
        System.out.printf("%s %s - Тормозим! \n", getBrand(), getModel());

    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s - На пит-стоп! \n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время круга - %s %s: %.0f мин. %.0f сек. \n", getBrand(), getModel(),
                (1 + Math.random() * (20)), Math.random() * 59);
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость - %s %s: %.0f км/ч \n", getBrand(), getModel(),
                (100 + Math.random() * (100)));
    }
}
