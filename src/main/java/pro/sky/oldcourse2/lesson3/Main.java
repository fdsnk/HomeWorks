package pro.sky.oldcourse2.lesson3;

import pro.sky.oldcourse2.lesson3.animals.Mammals.Herbivores;
import pro.sky.oldcourse2.lesson3.animals.Mammals.Predators;
import pro.sky.oldcourse2.lesson3.animals.Amphibians;
import pro.sky.oldcourse2.lesson3.animals.Birds.Flightless;
import pro.sky.oldcourse2.lesson3.animals.Birds.Flying;
import pro.sky.oldcourse2.lesson3.transport.Bus;
import pro.sky.oldcourse2.lesson3.transport.Car;
import pro.sky.oldcourse2.lesson3.transport.Train;
public class Main {
    public static void main(String[] args) {

//        Flower rosa = new Flower("Роза обыкновенная", "","Голландия", 35.59f, 4);
//        Flower chrysanthemum = new Flower("Хризантема", "","", 15f, 5);
//        Flower peony = new Flower("Пион", "","Англия", 69.9f, 1);
//        Flower gypsophila = new Flower("Гипсофила", "","Турция", 19.5f, 10);

//        System.out.println(rosa + "\n" + chrysanthemum + "\n" + peony + "\n" + gypsophila);
//        System.out.println();

        Car lada = new Car("Lada", "Granta", 2015, "Россия", "жёлтый", 120,
                1.7f, "МКПП", "Седан", "а111АА111", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 150,
                3.0f,"АКПП", "Хетчбек", "В222ВВ222", 5, true);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 180,
                -2,"АКПП", "Купе", "Е333ЕЕ123", 2, true);
        Car kia = new Car("Kia", "Sportage 4 поколения", 2018, "Южная Корея", "красный", 140,
                0,"АКПП", "Кроссовер", "М444ММ147", 7, false);

        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia);
        lada.refill();
        System.out.println();


        Train train1 = new Train("Ласточка", "B-901", 2011, "России", "", 301, 3500, 420,
                "Москва Белорусская", "Минск-Пассажирский", 11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "России", "", 270, 1700, 576,
                "Москва - Ленинградский", "Ленинград-Пассажирский", 8);

        System.out.println(train1 + "\n" + train2);
        train1.refill();
        System.out.println();

        Bus bus1 = new Bus("ПАЗ", "123", 1960, "Россия", "Красный", 90);
        Bus bus2 = new Bus("ПАЗ", "234", 1965, "Россия", "Белый", 91);
        Bus bus3 = new Bus("ПАЗ", "345", 1969, "Россия", "Синий", 92);

        System.out.println(bus1 + "\n" + bus2 + "\n" + bus3);
        bus1.refill();

        System.out.println("---------------------------------");

        Herbivores gazelle = new Herbivores("Газель", 3, "Саванна", 100, "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 1, "Саванна", 50, "Листва");
        Herbivores horse = new Herbivores("Лошадь", 3, "Лес", 65, "Сено");
        System.out.println(gazelle);
        giraffe.eat();
        System.out.println(horse.getClass());


        Predators hyena = new Predators("Гиена", 3, "Саванна", 50, "Мясо");
        Predators tiger = new Predators("Тигр", 1, "Саванна", 70, "Мясо");
        Predators bear = new Predators("Медведь", 5, "Лес", 40, "Мясо");
        System.out.println(tiger);
        hyena.hunting();
        bear.go();
        System.out.println(bear.getClass());


        System.out.println("---------------------------------");

        Amphibians frog = new Amphibians("Лягушка", 2, "Пруд");
        Amphibians snake = new Amphibians("Уж", 1, "Болото");
        System.out.println(frog);
        snake.hunting();
        frog.eat();
        System.out.println(snake.getClass());


        System.out.println("---------------------------------");

        Flightless penguin = new Flightless("Пингвин", 2, "Анктартида", "Земля и вода");
        Flightless peacock = new Flightless("Павлин", 1, "", "Земля");
        Flightless dodo = new Flightless("Птица ДоДо", 3, "", "");
        dodo.walk();
        penguin.hunting();
        System.out.println(peacock.getClass());

        Flying seagull = new Flying("Чайка", 2, "Море", "Летает и плавают");
        Flying albatross = new Flying("Альбатрос", 5, "", "");
        Flying falcon = new Flying("Сокол", 3, "Тропики", "");
        falcon.fly();
        albatross.hunting();
        System.out.println(falcon.getClass());

    }
}
