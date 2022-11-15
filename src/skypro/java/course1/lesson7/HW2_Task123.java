package skypro.java.course1.lesson7;

public class HW2_Task123 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("\nЗадание 1.\n");
        /*
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате "… год является високосным".
         */
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

    }

    public static void task2() {
        System.out.println("\nЗадание 2.\n");
        /*
        Напишите программу, которая выводит в консоль последовательность цифр:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

    }

    public static void task3() {
        System.out.println("\n\nЗадание 3.\n");
        /*
        Напишите программу, которая выводит в консоль последовательность цифр:
        1 2 4 8 16 32 64 128 256 512
         */
        for (int i = 1; i <= 512; i *=2) {
            System.out.print(i + " ");
        }

    }
}
