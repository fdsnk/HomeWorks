package skypro.java.course2.lesson4;

import skypro.java.course2.lesson4.drivers.Driver;
import skypro.java.course2.lesson4.transport.Bus;
import skypro.java.course2.lesson4.transport.Car;
import skypro.java.course2.lesson4.transport.Truck;

public class Main {
    public static void car() {

        Car[] car = new Car[10];
        car[0] = new Car("Lada", "Granta", 1.7f);
        car[1] = new Car("Audi", "A8", 3.0f);
        car[2] = new Car("BMW", "Z8", 3.5f);
        car[3] = new Car("Kia", "Sportage", 4.0f);
        for (Car list : car) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();

        car[0].go();
        System.out.println();
    }

    public static void truck() {
        Truck[] truck = new Truck[10];
        truck[0] = new Truck("ЛАЗ", "123", 2.0f);
        truck[1] = new Truck("МАЗ", "5440", 13.4f);
        truck[2] = new Truck("ГАЗ", "345", 11.5f);
        truck[3] = new Truck("КАМАЗ", "678", 16.0f);
        for (Truck list : truck) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();

        truck[1].stop();
        System.out.println();
    }

    public static void bus() {
        Bus[] bus = new Bus[10];
        bus[0] = new Bus("ГАЗель", "3110", 3.5f);
        bus[1] = new Bus("ПАЗ", "6756", 2.5f);
        bus[2] = new Bus("БЕЛаз", "3421", 3.7f);
        bus[3] = new Bus("СОБОЛЬ", "3414", 4.8f);
        for (Bus list : bus) {
            if (list != null)
                System.out.println(list);
        }
        System.out.println();

        bus[3].bestLapTime();
        System.out.println();
    }

    public static void main(String[] args) {
        car();
        truck();
        bus();

//        Driver<Car> petr = new Driver<>("Петр", "B", 10);
//        Driver<Truck> ivan = new Driver<>("Иван", "C", 8);
//        Driver<Bus> nik = new Driver<>("Николай", "D", 12);
//
//        petr.drive(new Car("Lada", "Priora", 1.6f));
//        ivan.drive(new Truck("KamAZ", "740", 10.8f));
//        nik.drive(new Bus("ЛиАЗ", "5256", 6.7));
    }
}

