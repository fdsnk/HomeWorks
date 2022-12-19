package skypro.java.course2.lesson4.transport;

import skypro.java.course2.lesson4.Validate_String;
public class Car extends Transport implements Competing {


    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void go() {
        System.out.println("Поехали!");
    }

    @Override
    public void stop() {
        System.out.println("Тормозим!");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость");
    }
}
