package pro.sky.course1.lesson5;

public class HW3_Task123 {
    public static void main(String[] args) {
        task1_education();
        task2_attraction();
        task3_more();
    }

    public static void task1_education() {
        System.out.println("Задание 1\n");
        /*
        Напишите программу, которая помогает определить в какое учреждение
        нужно отправить человека в зависимости от его возраста:
         Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
         Если человек от 7 до 18 лет, то ему нужно ходить в школу;
         Если человеку больше 18 лет, но меньше 24, то его место в университете;
         А если человеку больше 24, то ему пора ходить на работу
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате :
        "Если возраст человека равен … , то ему нужно ходить … (в зависимости от возраста дописать нужное)"
         */
        int age = 6;
        boolean adult = age >= 24;
        boolean student = age >= 18;
        boolean child = age >= 2;
        boolean school = age >= 7;

        System.out.print("Если возраст человека равен " + age);
        if (adult) {
            System.out.println(" ,то ему нужно ходить на работу.\n");
        } else if (student) {
            System.out.println(" ,то ему нужно ходить в университет.\n");
        } else if (school) {
            System.out.println(" ,то ему нужно ходить в школу.\n");
        } else if (child) {
            System.out.println(" ,то ему нужно ходить в детский сад.\n");
        } else {
            System.out.println(", то он совсем ещё младенец.\n");
        }
    }

    public static void task2_attraction() {
        System.out.println("Задание 2\n");
        /*
        Как правило, на аттракционах действуют ограничения и для детей по возрасту:
         Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
         Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
         Если взрослого нет, то кататься нельзя.
         Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение о том,
        можно ли ребенку кататься одному или в сопровождении взрослого в зависимости от того, сколько ему лет.
         */
        int age = 4;
        boolean adult = true;
        boolean more14Years = age >= 14;
        boolean less14Years = age >= 5;

        if (more14Years) {
            System.out.println("Тебе уже " + age + " лет, ты можешь кататься на атракционе без сопровождения взрослого.\n");
        } else if (less14Years) {
            if (adult == true) {
                System.out.println("Тебе уже " + age + " лет, ты можешь кататься на атракционе в сопровождении взрослого.\n");
            } else {
                System.out.println("Тебе уже " + age + " лет, но без сопровождения взрослого на атракционе кататься нельзя.\n");
            }
        } else {
            System.out.println("Тебе только " + age + " года, ты пока не можешь кататься на атракционе.\n");
        }
    }

    public static void task3_more() {
        System.out.println("Задание 3\n");
        /*
        Даны три числа:
            int one;
            int two;
            int three;
        С помощью условного оператора и конструкции else напишите программу,
        которая вычисляет, какое из трех чисел бОльшее и выводит результат в консоль.

        UPD: Дополнил условия равенства всех числе или пар чисел.
         */
        int num1 = 6;
        int num2 = 2;
        int num3 = 6;
        boolean numEqually = num1 == num2 && num1 == num3; // Условие, когда все числа равны
        boolean num1More = num1 >= num2 && num1 > num3; // Условие, когда 1 число бОльшее
        boolean num2More = num2 > num1 && num2 >= num3; // Условие, когда 2 число бОльшее
        boolean num1EquallyNum2 = num1 == num2; // Условие, когда 1 и 2 числа равны
        boolean num2EquallyNum3 = num2 == num3; // Условие, когда 2 и 3 числв равны
        boolean num3EquallyNum1 = num3 == num1; // Условие, когда 3 и 1 числа равны

        // Проверка на равество всех чисел
        if (numEqually) {
            System.out.println("Все числа равны.\n");
            // Проверка 1 числа
        } else if (num1More) {
            if (num1EquallyNum2) {
                System.out.println("Первое и второе числа равны и больше третьего.\n");
            } else {
                System.out.println("Первое число бОльшее из трёх чисел.\n");
            }
            // Проверка 2 числа
        } else if (num2More) {
            if (num2EquallyNum3) {
                System.out.println("Второе и третье числа равны и больше первого.\n");
            } else {
                System.out.println("Второе число бОльшее из трёх чисел.\n");
            }
            // Проверка 3 числа
        } else {
            if (num3EquallyNum1) {
                System.out.println("Первое и третье числа равны и больше второго.\n");
            } else {
                System.out.println("Третье число бОльшее из трёх чисел.\n");
            }
        }
    }
}
