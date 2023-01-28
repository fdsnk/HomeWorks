package skypro.java.course2.lesson6;

import skypro.java.course2.lesson6.drivers.Driver;
import skypro.java.course2.lesson6.drivers.DriverB;
import skypro.java.course2.lesson6.drivers.DriverC;
import skypro.java.course2.lesson6.drivers.DriverD;
import skypro.java.course2.lesson6.exceptions.NoLicenseException;
import skypro.java.course2.lesson6.transport.Bus;
import skypro.java.course2.lesson6.transport.Car;
import skypro.java.course2.lesson6.transport.Transport;
import skypro.java.course2.lesson6.transport.Truck;

public class Main {
    public static void main(String[] args) throws NoLicenseException {
        Car lada = new Car("Lada", "Granta", 1.7f, true, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8", 3.0f, true, Car.BodyType.HATCHBACK);
        Car bmw = new Car("BMW", "Z8", 3.5f, true, Car.BodyType.COUPE);
        Car kia = new Car("Kia", "Sportage", 4.0f, true, Car.BodyType.SUV);

        Truck laz = new Truck("ЛАЗ", "123", 2.0f, true, Truck.LoadCapacity.N1);
        Truck maz = new Truck("МАЗ", "5440", 13.4f, true, Truck.LoadCapacity.N2);
        Truck gaz = new Truck("ГАЗ", "345", 11.5f, true, Truck.LoadCapacity.N1);
        Truck kamaz = new Truck("КАМАЗ", "678", 16.0f, true, Truck.LoadCapacity.N3);

        Bus gazel = new Bus("ГАЗель", "3110", 3.5f, true, Bus.Capacity.SMALL);
        Bus paz = new Bus("ПАЗ", "6756", 2.5f,  true, Bus.Capacity.AVERAGE);
        Bus belaz = new Bus("БЕЛаз", "3421", 3.7f,  true, Bus.Capacity.LARGE);
        Bus sobol = new Bus("СОБОЛЬ", "3414", 4.8f,  true, Bus.Capacity.ESPECIALLY_SMALL);


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
        checkTransport(lada, audi, belaz, bmw, maz, laz);
    }

    public static void checkTransport(Transport... transports) {
        int count = 0;
        for (Transport transport : transports) {
            if (!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                count++;
            }
        }
        System.out.println("Диагностику прошли " + count + " из " + transports.length + " автомобилей.");
    }

    public static void separator() {
        System.out.println(
                "==============================================================================================");
    }
}

