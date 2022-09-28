package skypro.java.course1.lesson5;

public class HW2_Task123 {
    public static void main(String[] args) {
        task1_congratulation_else();
        task2_education_else();
        task3_places_train_else();
    }

    // Задание 1
    public static void task1_congratulation_else() {
        System.out.println("Задание 1\n");
        /*
        поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
         */
        int age = 19;
        if (age >= 18) {
            System.out.println("Вам уже " + age + ". Поздравляем с совершеннолетием!\n");
        } else {
            System.out.println("Вам ещё только " + age +
                    ". Возраст совершеннолетия ещё не наступил, нужно немного подождать.\n");
        }
    }

    // Задание 2
    public static void task2_education_else() {
        System.out.println("Задание 2\n");
        /*
        ребенок ходит в школу, если его возраст равен или больше 7 годам
        человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
         */
        int age = 19;
        if (age >= 24) {
            System.out.println("Человеку " + age + ". Он уже на работе.\n");
        } else if (age >= 18) {
            System.out.println("Человеку " + age + ". Он уже закончил школу, пора получать высшее образование.\n");
        } else if (age >= 7) {
            System.out.println("Ребёнку " + age + ". Он уже ходит в школу!\n");
        } else {
            System.out.println("Ребёнку " + age + ". В школу ещё рано идти.\n");
        }
    }

    // Задание 3
    public static void task3_places_train_else() {
        System.out.println("Задание 3\n");
        /*
        Вместимость одного вагона поезда составляет 102 человека.
        Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        Напишите программу, которая выводит в консоль сообщение о том, есть ли место в вагоне:
        сидячее или стоячее или вагон уже полностью забит.
         */
        int placesTrain = 102;
        int seatsTrain = 60;
        int standTrain = placesTrain - seatsTrain;

        int totalPass = 10;
        System.out.print("Если в вагон зайдет " + totalPass + " человек");
        if (totalPass >= placesTrain) {
            System.out.println(", то мест в вагоне не останется.");
        } else if (totalPass < seatsTrain) {
            System.out.println(", то останется сидячих мест - " + (seatsTrain - totalPass) + ", а стоячих - " + standTrain + ".\n");
        } else {
            System.out.println(", то останется " + (seatsTrain - (totalPass - standTrain)) + " стоячих мест.\n");
        }
    }
}
