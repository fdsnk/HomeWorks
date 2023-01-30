package pro.sky.course1.lesson3;
/*
Уменьшить значение каждой переменной:

 dog уменьшить на 3,5;
 cat уменьшить на 1,6;
 paper уменьшить на 7639;
Выведите в консоль новые значения переменных. Для решения этой задачи используйте тип переменной var.
 */
public class T3_Subtracting_Variables {
    public static void main(String[] args) {
        var dog = 6.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog -3.5;
        cat = cat - 1.6;
        paper = paper - 639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
}
