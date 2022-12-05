package skypro.java.course2.lesson3;

import skypro.java.course2.lesson3.transport.Car;
import skypro.java.course2.lesson3.transport.Transport;

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
    }
}
