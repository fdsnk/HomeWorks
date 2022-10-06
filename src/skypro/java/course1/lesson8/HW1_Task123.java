package skypro.java.course1.lesson8;

public class HW1_Task123 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1.\n");
        /*
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль в формате
        "Месяц … , сумма накоплений равна … рублей"
        с тем количеством месяцев, необходимым для накопления данной суммы.
         */
        int salary = 15_000;
        int total = 0;
        int month = 1;
        int goal = 2_459_000;
        while (total <= goal) {
            total += salary;
            total += total / 100;
            month++;
        }
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", month, total);
    }

    public static void task2() {
        System.out.println("\nЗадание 2.\n");
        /*
        Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1
         */
        int num = 0;
        while (num < 10) {
            num++;
            System.out.printf("%d ", num);
        }
        System.out.println();
        for (;num > 0; --num) {
            System.out.printf("%d ", num);
        }
    }

    public static void task3() {
        System.out.println("\n\nЗадание 3.\n");
        /*
        В стране Y население равно 12 миллионам человек.
        За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
        что показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате
        "Год …, численность населения составляет … "
         */
        int countryPopulation = 12_000_000;
        int birthRate;
        int mortalityRate;
        for (int i = 1; i < 11; i++) {
            birthRate = 17 * countryPopulation / 1000;
            mortalityRate = 8 * countryPopulation / 1000;
            countryPopulation += birthRate - mortalityRate;
            System.out.printf("Год %d, численность населения составляет %d.\n", i, countryPopulation);
        }
    }
}
