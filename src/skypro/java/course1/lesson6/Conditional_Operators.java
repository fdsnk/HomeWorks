package skypro.java.course1.lesson6;

import java.text.DecimalFormat;

public class Conditional_Operators {
    public static void main(String[] args) {
        task1_mobile_application();
        task2_mobile_application_light();
        task3_leap_years();
        task4_delivery();
        task5_month();
        task6_dop_bank();
        task7_dop_bank_credit();
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
        "Потребуется дней: " + срок доставки.
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

    public static void task6_dop_bank() {
        System.out.println("Задача 6.\n");
        /*
        Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
        Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
        Увеличения не могут быть применены одновременно. Необходимо вывести максимальный лимит в консоль в формате:
        «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
        Критерии оценки
        • При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
        • При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
        • Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
        • Правила синтаксиса и пунктуации соблюдены.
         */
        int age = 25;
        int standartAge = 23;
        int salary = 30_000;
        int standardSalary = 50_000;
        int moreStandartSalary = 80_000;
        int limitYoung = salary * 2;
        int limitAdult = salary * 3;
        float creditLimit;
        System.out.print("Мы готовы выдать Вам кредитную карту с лимитом ");
        if (age >= standartAge && salary >= moreStandartSalary) {
            creditLimit = limitAdult * 1.5f;
        } else if (age >= standartAge && salary >= standardSalary) {
            creditLimit = limitAdult * 1.2f;
        } else if (age >= standartAge && salary < standardSalary) {
            creditLimit = limitAdult;
        } else if (age < standartAge && salary >= moreStandartSalary) {
            creditLimit = limitYoung * 1.5f;
        } else if (age < standartAge && salary >= standardSalary) {
            creditLimit = limitYoung * 1.2f;
        } else {
            creditLimit = limitYoung;
        }
        System.out.println(creditLimit + " рублей.\n");
    }

    public static void task7_dop_bank_credit() {
        System.out.println("Задание 7.\n");
        /*
        Базовая ставка для клиента — 10% годовых (0.1). Срок кредитования — 12 месяцев.
        Максимальный ежемесячный платеж — 50% от ЗП.
        Если возраст меньше 23, то добавляем 1% к ставке. (0.11)
        Если возраст меньше 30, то добавляем 0.5% к ставке. (0.105)
        Если зарплата больше 80_000, уменьшаем ставку на 0.7%. (0.007)
        Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
        Вводные данные: используйте переменные age = 25 для обозначения возраста, salary = 60_000 для обозначения зарплаты,
        wantedSum = 330_000 для обозначения желаемой суммы кредита.
        Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный допустимый платеж.
        Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно процентной ставке,
        то кредит одобрен, если меньше — отказан.
        Пример ответа в консоль: «Максимальный платеж при ЗП * равен * рублей. Платеж по кредиту *** рублей. Одобрено/отказано».
        Критерии оценки
        • При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
        • При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
        • Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
        • Нет вложенности в коде.
         */
        int age = 30;
        int salary = 70_000;
        int standartSalary = 80_000;
        int wantedSum = 330_000;
        int maxMonthPayment = salary / 2;
        float monthPayment;
        float baseRate = 0.1f;
        float baseRateStandartSalary = baseRate - 0.007f;
        float baseRateLess23Age = baseRate + 0.01f;
        float baseRateLess30Age = baseRate + 0.005f;
        float baseRateLess23AgeStandartSalary = baseRateLess23Age - 0.007f;
        float baseRateLess30AgeStandartSalary = baseRateLess30Age - 0.007f;
        System.out.print("Максимальный платеж при ЗП " + salary + " руб. равен " + maxMonthPayment + " руб. Платеж по кредиту ");
        if (age >= 30 && salary < standartSalary) {
        } else if (age >= 30 && salary >= standartSalary) {
            baseRate = baseRateStandartSalary;
        } else if (age >= 23 && salary >= standartSalary) {
            baseRate = baseRateLess30AgeStandartSalary;
        } else if (age >= 23 && salary < standartSalary) {
            baseRate = baseRateLess30Age;
        } else if (age < 23 && salary >= standartSalary) {
            baseRate = baseRateLess23AgeStandartSalary;
        } else {
            baseRate = baseRateLess23Age;
        }
        monthPayment = (wantedSum * baseRate + wantedSum) / 12;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");   //  Класс DecimalFormat. Он предназначен для форматирования любого числа в Java,
        String result = decimalFormat.format(monthPayment);               //  будь это целое число или число с плавающей запятой.
        System.out.print(result + " рублей. ");
        if (monthPayment >= maxMonthPayment) {
            System.out.println("Не одобрено.\n");
        } else {
            System.out.println("Одобрено.\n");
        }
    }
}
