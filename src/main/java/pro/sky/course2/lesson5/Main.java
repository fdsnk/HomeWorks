package pro.sky.course2.lesson5;

import pro.sky.course2.lesson5.drivers.Driver;
import pro.sky.course2.lesson5.drivers.DriverB;
import pro.sky.course2.lesson5.drivers.DriverC;
import pro.sky.course2.lesson5.drivers.DriverD;
import pro.sky.course2.lesson5.transport.Bus;
import pro.sky.course2.lesson5.transport.Car;
import pro.sky.course2.lesson5.transport.Transport;
import pro.sky.course2.lesson5.transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7f, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8", 3.0f, Car.BodyType.HATCHBACK);
        Car bmw = new Car("BMW", "Z8", 3.5f, Car.BodyType.COUPE);
        Car kia = new Car("Kia", "Sportage", 4.0f, Car.BodyType.SUV);

        Truck laz = new Truck("ЛАЗ", "123", 2.0f, Truck.LoadCapacity.N1);
        Truck maz = new Truck("МАЗ", "5440", 13.4f, Truck.LoadCapacity.N2);
        Truck gaz = new Truck("ГАЗ", "345", 11.5f, Truck.LoadCapacity.N1);
        Truck kamaz = new Truck("КАМАЗ", "678", 16.0f, Truck.LoadCapacity.N3);

        Bus gazel = new Bus("ГАЗель", "3110", 3.5f, Bus.Capacity.SMALL);
        Bus paz = new Bus("ПАЗ", "6756", 2.5f, Bus.Capacity.AVERAGE);
        Bus belaz = new Bus("БЕЛаз", "3421", 3.7f, Bus.Capacity.LARGE);
        Bus sobol = new Bus("СОБОЛЬ", "3414", 4.8f, Bus.Capacity.ESPECIALLY_SMALL);


        DriverB<Car> sergeyCar = new DriverB<>("Сергей Иванович Автович", true, 3);
        DriverC<Truck> semenTruck = new DriverC<>("Семен Алексеевич Грузовиков", true, 2);
        DriverD<Bus> antonBus = new DriverD<>("Антон Антонович Автобусов", true, 5);


        separator();
        System.out.println(lada);
        System.out.println(gaz);
        System.out.println(belaz);
        separator();
        lada.printType();
        gaz.printType();
        belaz.printType();
        separator();
        sergeyCar.toStringForStart(lada);
        semenTruck.toStringForStart(laz);
        antonBus.toStringForStart(sobol);
        separator();
        audi.go();
        maz.go();
        belaz.go();
        separator();
        bmw.bestLapTime();
        separator();
        kamaz.pitStop();
        gazel.pitStop();
        audi.pitStop();
        separator();
        kia.maxSpeed();
        paz.maxSpeed();
        separator();
        lada.stop();
        kamaz.stop();
        paz.stop();
        separator();
    }
    public static void separator() {
        System.out.println(
                "==============================================================================================");
    }
}

