package skypro.java.course2.lesson4.transport;

public class Bus extends Transport implements Competing{


    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void go() {
        System.out.println("Go-go-go!");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаемся!");
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
