package pro.sky.course2.lesson3.transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Объекты класса bus можно заправлять бензином или дизелем на заправке.");
    }
}
