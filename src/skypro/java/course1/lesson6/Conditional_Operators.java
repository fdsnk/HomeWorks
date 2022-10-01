package skypro.java.course1.lesson6;

public class Conditional_Operators {
    public static void main(String[] args) {
        task1_mobile_application();
        task2_mobile_application_light();
        task3_leap_years();
        task4_delivery();
        task5_month();
    }

    private static void task1_mobile_application() {
        System.out.println("Задание 1\n");
        /*
        Напишите программу, которая определяет, чем пользуется клиент (iOS или Android),
        и выдает соответствующее сообщение для обоих вариантов.
        Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        Например, для iOS оно будет звучать так: «Установите версию приложения для iOS по ссылке».
        А для Android так: «Установите версию приложения для Android по ссылке».
         */
        int clientOS = 0; // 0 — iOS, 1 — Android
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.\n");
                break;
            //    default:
            //        System.out.println("К сожалению, для Вашего устройства нет приложения.\n");  //
        }
    }

    public static void task2_mobile_application_light() {
        System.out.println("Задание 2.\n");
        /*
        Написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий —
        операционной системы телефона (iOS или Android) и года производства.
        Если год выпуска ранее 2015 года, то к сообщению об установке
        нужно добавить информацию об облегченной версии.
        Например, для iOS оно будет звучать так:
        «Установите облегченную версию приложения для iOS по ссылке».
        А для Android так:
        «Установите облегченную версию приложения для Android по ссылке».
        При этом для пользователей с телефоном с 2015 года выпуска нужно
        вывести обычное предложение об установке приложения.
        Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
        **Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
         */
        int clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке.\n");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.\n");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке.\n");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.\n");
        }
    }

    public static void task3_leap_years() {
        System.out.println("Задание 3.\n");
        /*
        Напишите программу, которая определяет, является ли год високосным или нет.
        Переменную года назовите year, в которую можно подставить значение интересующего нас года.
        Например, 2021.
        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        «... год является високосным».
        или
        «... год не является високосным».
        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        Также високосным является каждый четырехсотый год.
         */
        int year = 2100;
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }
    }

    public static void task4_delivery() {
        System.out.println("Задание 4.\n");
        /*
        Чтобы известить клиента о том, когда будет доставлена его карта,
        нам нужно знать расстояние от нашего офиса до адреса доставки.
        Правила доставки такие:
        Доставка в пределах 20 км занимает сутки.
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        Напишите программу, которая выдает сообщение в консоль:
        "Потребуется дней: " + срок доставки
        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        */

        int deliveryDistance = 100;
        int deliveryDays = 1;
        int distanceAddDays = 40; // Шаг расстояния, при котором увеличивается доставка на СУТКИ
        int remainingDistance = deliveryDistance - 20; // Если разница <= 0, то выведем СУТКИ на доставку, если больше, то ИНАЧЕ
        System.out.print("Потребуется дней: ");
        if (remainingDistance <= 0) {
            System.out.println(deliveryDays + "\n");
        } else if (remainingDistance % distanceAddDays != 0) {
            System.out.println((deliveryDays += remainingDistance / distanceAddDays + 1) + "\n");
        } else {
            System.out.println((deliveryDays += remainingDistance / distanceAddDays) + "\n");
        }
    }

    public static void task5_month() {
        System.out.println("Задача 5.\n");
        /*
        Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        Например, 1 месяц (он же январь) принадлежит к сезону зима.
        Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
         */
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц.\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц.\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц.\n");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц.\n");
                break;
            default:
                System.out.println("Такого месяца не существует.\n");
        }
    }
}
