package skypro.java.course1.lesson4;

public class T6_FirstRecipe {
    public static void main(String[] args) {
        /*
        Вот один из рецептов, который использует наш спортсмен перед тренировкой:
        – Бананы – 5 штук (1 банан - 80 грамм);
        – Молоко – 200 мл (100 мл = 105 грамм);
        – Мороженое пломбир – 2 брикета по 100 грамм;
        – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        Смешать всё в блендере и готово.
        Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        Результат напечатайте в консоль.
         */
        int weightBanana = 80;
        int weightMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;

        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;

        float weightGrams = bananas * weightBanana + milk * weightMilk + iceCream * weightIceCream + eggs * weightEgg;
        float weightKg = weightGrams / 1000;
        System.out.println("Вес спорт-завтрака равен " + weightKg + " кг");
    }
}
