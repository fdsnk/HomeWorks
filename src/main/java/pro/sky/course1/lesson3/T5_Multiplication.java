package pro.sky.course1.lesson3;
/*
Инициализируйте переменную frog значением 3,5.
Умножьте переменную в 10 раз и поделите на 3,5. Добавьте к последнему значению переменной 4.
После каждой операции выводите значение переменной в консоль.
В итоге, у вас должно быть выведено 4 значения одной переменной.
Для решения этой задачи используйте тип переменной var.
 */
public class T5_Multiplication {
    public static void main(String[] args) {
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }
}
