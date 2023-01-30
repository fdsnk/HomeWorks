package pro.sky.course2.lesson4;

import pro.sky.course2.lesson4.drivers.Driver;
import pro.sky.course2.lesson4.drivers.DriverB;
import pro.sky.course2.lesson4.drivers.DriverC;
import pro.sky.course2.lesson4.drivers.DriverD;
import pro.sky.course2.lesson4.transport.Bus;
import pro.sky.course2.lesson4.transport.Car;
import pro.sky.course2.lesson4.transport.Transport;
import pro.sky.course2.lesson4.transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7f);
        Car audi = new Car("Audi", "A8", 3.0f);
        Car bmw = new Car("BMW", "Z8", 3.5f);
        Car kia = new Car("Kia", "Sportage", 4.0f);

        Truck laz = new Truck("ЛАЗ", "123", 2.0f);
        Truck maz = new Truck("МАЗ", "5440", 13.4f);
        Truck gaz = new Truck("ГАЗ", "345", 11.5f);
        Truck kamaz = new Truck("КАМАЗ", "678", 16.0f);

        Bus gazel = new Bus("ГАЗель", "3110", 3.5f);
        Bus paz = new Bus("ПАЗ", "6756", 2.5f);
        Bus belaz = new Bus("БЕЛаз", "3421", 3.7f);
        Bus sobol = new Bus("СОБОЛЬ", "3414", 4.8f);


        DriverB<Car> sergeyCar = new DriverB<>("Сергей Иванович Автович", true, 3);
        DriverC<Truck> semenTruck = new DriverC<>("Семен Алексеевич Грузовиков", true, 2);
        DriverD<Bus> antonBus = new DriverD<>("Антон Антонович Автобусов", true, 5);

        separator();
        System.out.println(lada);
        System.out.println(gaz);
        System.out.println(belaz);
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

