package pro.sky.course1.lesson3;
/*
Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
Для решения этой задачи используйте тип переменной var.
 */
public class T2_Adding_Variables {
    public static void main(String[] args) {
        var dog = 6;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}
