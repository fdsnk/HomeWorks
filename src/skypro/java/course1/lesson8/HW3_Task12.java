package skypro.java.course1.lesson8;

public class HW3_Task12 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание 1.\n");
/*
        Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с
        Землей каждый 79-й год, начиная с нулевого. Нам нужно узнать, в каких годах комета
        пролетала рядом с Землей за последние 200 лет, и когда мы увидим ее в следующий раз.
        Условия задачи:
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
        а также следующий год ее появления. Для вычисления периода можно создать две дополнительные
        переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной)
        в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054
*/
        int year = 0;
        int periodCometPassage = 79;
        int nowYear = 2022;
        int last200Years = nowYear - 200;
        int next100Years = nowYear + 100;
        while (year < next100Years) {
            if (year > last200Years) {
                System.out.println(year);
            }
            year += periodCometPassage;
        }
    }

    public static void task2() {
        System.out.println("\nЗадание 2.\n");
        /*
        Напишите программу, которая выводит в консоль таблицу умножения на 2:
        2*1=2
        2*2=4
        2*3=6
        2*4=8
        2*5=10
        2*6=12
        2*7=14
        2*8=16
        2*9=18
        2*10=20
         */
        int num2 = 2;
        int multiplication;
        for (int i = 1; i <= 10; i++) {
            multiplication = num2 * i;
            System.out.printf("%d * %d = %d\n", num2, i, multiplication);
        }

    }
}
