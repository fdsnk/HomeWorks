package pro.sky.course1.lesson4;

public class T7_Diet {
    public static void main(String[] args) {
        /*
        Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг,
        чтобы оставаться в своей весовой категории.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день
        по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты всех подсчетов выведите в консоль.
         */
        int grPerKg = 1000;
        int extraKg = 7;
        int extraGr = extraKg * grPerKg;

        int lightDiet = 250;
        int hardDiet = 500;

        int daysToGoalLight = extraGr / lightDiet;
        System.out.println(daysToGoalLight + " дней уйдет на похудение, если терять каждый день по " + lightDiet + " гр");

        int daysToGoalHard = extraGr / hardDiet;
        System.out.println(daysToGoalHard + " дней уйдет на похудение, если терять каждый день по " + hardDiet + " гр");

        int averageDaysToGoal = (daysToGoalHard + daysToGoalLight) / 2;
        System.out.println("В среднем может потребоваться " + averageDaysToGoal + " дней, чтобы добиться результата похудения");
    }
}
