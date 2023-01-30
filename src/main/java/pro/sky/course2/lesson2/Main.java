package pro.sky.course2.lesson2;

import pro.sky.course2.lesson2.transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        Human vadim = new Human("Вадим", "Казань", LocalDate.now().getYear() - 21, "");

        System.out.println(maksim + "\n" + anya + "\n" + katya + "\n" + artem + "\n" + vadim);
        System.out.println();

        Flower rosa = new Flower("Роза обыкновенная", "","Голландия", 35.59f, 4);
        Flower chrysanthemum = new Flower("Хризантема", "","", 15f, 5);
        Flower peony = new Flower("Пион", "","Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", "","Турция", 19.5f, 10);

        System.out.println(rosa + "\n" + chrysanthemum + "\n" + peony + "\n" + gypsophila);
        System.out.println();

        /*
        * Напишите программу, с помощью которой можно посчитать стоимость букета в
        * зависимости от состава цветов в нем и узнать срок стояния букета.
        * Стоимость букета рассчитывается в зависимости от состава + 10% надбавка за работу флориста.
        * Срок стояния букета считается по наименьшему сроку. В консоль должна выводиться информация
        * о составе букета, его стоимости и сроке стояния. Например,  букет, в котором есть
        * роза обыкновенная – 3 , хризантема – 5, гипсофила – 1, будет стоить 220,84 рублей и простоит 3 суток.
         */
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "жёлтый",
                1.7f, "МКПП", "Седан", "а111АА111", 5, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный",
                3.0f,"АКПП", "Хетчбек", "В222ВВ222", 5, true);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный",
                -2,"АКПП", "Купе", "Е333ЕЕ123", 2, true);
        Car kia = new Car("Kia", "Sportage 4 поколения", 2018, "Южная Корея", "красный",
                0,"АКПП", "Кроссовер", "М444ММ147", 7, false);

        System.out.println(lada + "\n" + audi + "\n" + bmw + "\n" + kia);
    }
}
