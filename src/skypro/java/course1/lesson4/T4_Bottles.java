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
        int bottles = 16;
        int bottlesOneMin = bottles / 2;
        int minPerDay = 60 * 24;
        int minPerMouth = minPerDay * 30;

        bottles = bottlesOneMin * 20;
        System.out.println("За 20 минут машина произвела " + bottles + " штук бутылок");

        bottles = bottlesOneMin * minPerDay;
        System.out.println("За сутки машина произвела " + bottles + " штук бутылок");

        bottles = bottlesOneMin * minPerDay * 3;
        System.out.println("За трое суток машина произвела " + bottles + " штук бутылок");

        bottles = bottlesOneMin * minPerMouth;
        System.out.println("За месяц машина произвела " + bottles + " штук бутылок");

    }
}
