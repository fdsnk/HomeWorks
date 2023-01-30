package pro.sky.course1.lesson3;
/*
В боксе, перед каждым боем, спортсменов взвешивают –
это делают для того, чтобы убедиться,
что боксеры соответствуют своей весовой категории, и бой будет честным.
Вес одного боксера – 78,2 кг
Вес второго боксера – 82,7 кг
Подсчитайте и выведите в консоль общий вес двух бойцов.
Подсчитайте и выведите в консоль разницу между весами бойцов.
Для решения этой задачи используйте тип переменной var.
 */
public class T6_Multiple_Variables {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");

        var differenceWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница между весами боксеров " + Math.abs(differenceWeight) + " кг"); //Метод Math.abs() – дает абсолютное значение аргумента
    }
}
