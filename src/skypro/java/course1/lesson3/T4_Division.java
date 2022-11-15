package skypro.java.course1.lesson3;
/*
Инициализируйте (=присвойте значение) переменную friend значением 19.
Увеличьте значение переменной на 2, после чего поделите значение на 7.
После каждой операции выводите значение переменной в консоль.
В итоге, у вас должно быть выведено 3 значения одной переменной.
Для решения этой задачи используйте тип переменной var.
 */
public class T4_Division {
    public static void main(String[] args) {
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }
}
