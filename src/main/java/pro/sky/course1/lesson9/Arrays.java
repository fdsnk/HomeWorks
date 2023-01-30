package pro.sky.course1.lesson9;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Задание 1.\n");
        /*
         * Объявите три массива:
         * Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
         * Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 – сразу заполнив его значениями.
         * Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
         * с помощью ключевого слова или сразу заполненный элементами.
         */
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        double[] fractionalNums = {1.57, 7.654, 9.986};
        long[] longNums = {123_456_789, 987_654_321};
        System.out.println("Произведена инициализация 3-х массивов.");

        System.out.println("\nЗадание 2.\n");
        /*
         * Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
         * начиная с первого элемента, через запятую. Запятая между последним элементом одного
         * массива и первым элементом следующего не нужна.
         */
        System.out.println(integers[0] + ", " + integers[1] + ", " + integers[2]);
        System.out.println(fractionalNums[0] + ", " + fractionalNums[1] + ", " + fractionalNums[2]);
        System.out.println(longNums[0] + ", " + longNums[1]);

        System.out.println("\nЗадание 3.\n");
        /*
         * Распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
         */
        System.out.println(integers[2] + ", " + integers[1] + ", " + integers[0]);
        System.out.println(fractionalNums[2] + ", " + fractionalNums[1] + ", " + fractionalNums[0]);
        System.out.println(longNums[1] + ", " + longNums[0]);

        System.out.println("\nЗадание 4.\n");
        /*
         * Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
         * Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
         * Распечатайте результат преобразования в консоль.
         */
        for (int i = 0; integers.length > i; i++) {
            if (integers[i] % 2 == 0) {
                System.out.print(integers[i] + " ");
            } else {
                System.out.print((integers[i] + 1) + " ");
            }
        }
    }
}
