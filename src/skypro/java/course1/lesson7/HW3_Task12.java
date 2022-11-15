package skypro.java.course1.lesson7;

public class HW3_Task12 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("\nЗадание 1.\n");
        /*
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
         */
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

    }

    public static void task2() {
        /*
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку", а в банк под проценты – 12% годовых.
        Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
         */
        System.out.println("\nЗадание 2.\n");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

    }
}
