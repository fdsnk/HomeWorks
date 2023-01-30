package pro.sky.course1.lesson8;

public class HW_Dop_Task12 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1.\n");
        /*
        Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится
        на 3 без остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
        Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        Допускается наличие пустых строк в выводе.
        • Вывод должен быть следующий:
        1:
        2:
        3: ping
        4:
        5: pong
        6: ping
        7:
        8:
        9: ping
        10: pong
        11:
        12: ping
        13:
        14:
        15: ping pong
        16:
        17:
        18: ping
        19:
        20: pong
        • Критерии оценки
        – В консоль выводится значение из условия задачи
        – Цикл проходит по значениям и выполняет условие задачи деления цифр на 3 и 5
        – Код написан корректно и без ошибок.
         */
        for (int i = 0; i <= 30; i++) {
            System.out.printf("%d: ", i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ping pong");
            } else if (i % 3 == 0) {
                System.out.println("ping");
            } else if (i % 5 == 0) {
                System.out.println("pong");
            } else {
                System.out.println();
            }
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 1.\n");
        /*
        Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        – Каждое следующее число равняется сумме двух предыдущих.
        Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        Должно получиться следующее:
        0 1 1 2 3 5 8 13 21 34

        • Справка
        Числа Фибоначчи – элементы числовой последовательности
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … , в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел. Названы в честь средневекового математика Леонардо Пизанского.
        • Критерии оценки
        – Код написан корректно и выполняет условия задачи при изменении значений переменной;
        – В коде не допущено ошибок или неверного использования конструкций; – Все условия задачи выполняются.
         */
        int num1 = 0;
        int num2 = 1;
        int fibonacciSeq;
        System.out.printf("%d %d ", num1, num2);
        for (int i = 0; i < 8; i++) {
            fibonacciSeq = num1 + num2;
            num1 = num2;
            num2 = fibonacciSeq;
            System.out.printf("%d ", fibonacciSeq);
        }
    }
}
