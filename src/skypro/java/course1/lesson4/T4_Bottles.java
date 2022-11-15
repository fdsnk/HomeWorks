package skypro.java.course1.lesson4;

public class T4_Bottles {
    public static void main(String[] args) {
        /*
        Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты.
        Какая производительность машины будет:
            за 20 минут
            в сутки
            за 3 дня
            за 1 месяц
         Рассчитывайте продолжительность работы машины в том случае,
         если она работает без перерыва заданный промежуток времени.
         Результаты подсчетов выведите в консоль в формате
         "За … машины произвела бутылок … штук "
         */
        int bottles = 16; // 16 за 2 минуты
        int bottlesOneMin = bottles / 2; // бутылок за 1 минуту
        int minPerDay = 60 * 24; // минут в сутках
        int minPerMouth = minPerDay * 30; // минут в 30 дневном месяце

        bottles = bottlesOneMin * 20; // бутылок за 20 минут
        System.out.println("За 20 минут машина произвела " + bottles + " штук бутылок");

        bottles = bottlesOneMin * minPerDay; // бутылок за 1 сутки
        System.out.println("За сутки машина произвела " + bottles + " штук бутылок");

        bottles = bottlesOneMin * minPerDay * 3; // бутылок за 3 суток
        System.out.println("За трое суток машина произвела " + bottles + " штук бутылок");

        bottles = bottlesOneMin * minPerMouth; // бутылок за месяц (30 дней)
        System.out.println("За месяц машина произвела " + bottles + " штук бутылок");

    }
}
