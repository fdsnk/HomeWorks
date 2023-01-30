package pro.sky.course1.lesson10;

import java.util.Arrays;

public class Arrays_Part_2 {
    public static void main(String[] args) {

        System.out.println("Задача 1.\n");
        /*
         * Посчитать сумму всех выплат за месяц. Нужно написать программу, которая решит эту задачу,
         * и вывести в консоль результат в формате: «Сумма трат за месяц составила … рублей».
         */
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %.0f рублей.\n", sum);

        System.out.println("\nЗадача 2.\n");
        /*
         * Найти минимальную и максимальную трату за день.
         * Нужно написать программу, которая решит эту задачу, и вывести в консоль результатов формате:
         * «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        Arrays.sort(arr);
        System.out.printf("Минимальная сумма трат за день составила %d рублей.\n", arr[0]);
        System.out.printf("Максимальная сумма трат за день составила %d рублей.\n", arr[arr.length - 1]);

        System.out.println("\nЗадача 3.\n");
        /*
         * Нужно написать программу, которая посчитает среднее значение трат за месяц
         * (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
         * «Средняя сумма трат за месяц составила … рублей».
         */
        double average = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);

        System.out.println("\nЗадача 4.\n");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length - 1; c >= 0; c--) {
            System.out.print(reverseFullName[c]);
        }
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
