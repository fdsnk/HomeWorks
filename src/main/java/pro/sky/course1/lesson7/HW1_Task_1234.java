package pro.sky.course1.lesson7;

public class HW1_Task_1234 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1.\n");
        /*
        С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }
    }

    public static void task2() {
        System.out.println("\nЗадание 2.\n");
        /*
        С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task3() {
        System.out.println("\nЗадание 2.\n");
        /*
        Выведите в консоль все четные числа от 0 до 17.
         */
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Чётное число " + i);
        }
    }

    public static void task4() {
        System.out.println("\nЗадание 2.\n");
        /*
        Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
         */
        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }
    }
}
