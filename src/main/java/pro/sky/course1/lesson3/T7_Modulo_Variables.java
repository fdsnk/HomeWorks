package pro.sky.course1.lesson3;
/*
Вычислите разницу весов спортсменов, используя 2 способа:
 Вычитание из большего веса меньшего
 Используя функцию остаток от деления
Для решения этой задачи используйте тип переменной var.
 */
public class T7_Modulo_Variables {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var differenceWeight = secondBoxerWeight - firstBoxerWeight; // Вычитание большего из меньшего
        System.out.println("Разница между весами боксеров " + differenceWeight + " кг");

        var differenceModuloWeight = secondBoxerWeight % firstBoxerWeight; // Остаток от деления
        System.out.println("Разница между весами боксеров " + differenceModuloWeight + " кг");
    }
}
