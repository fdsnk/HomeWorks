package skypro.java.course2.lesson9;

import skypro.java.course2.lesson9.telephone.directory.TelephoneDirectory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 120.0, 1.5);
        Product tomato = new Product("Помидор", 100.0, 1.0);
        Product potatoes = new Product("Картошка", 80.0, 5.5);
        Product carrot = new Product("Морковь", 70.5, 2.5);
        Product cabbage = new Product("Капуста", 85.0, 3.0);
        Product beet = new Product("Свёкла", 95.0, 1.0);

        Recipe salad = new Recipe("Салат");
        salad.addProductInRecipe(cabbage,3);
        salad.addProductInRecipe(carrot,4);

        Recipe saladTwo = new Recipe("Салат 2");
        saladTwo.addProductInRecipe(potatoes,3);
        saladTwo.addProductInRecipe(beet,3);

        Recipe saladThree = new Recipe("Салат 3");
        saladThree.addProductInRecipe(potatoes,4);
        saladThree.addProductInRecipe(beet,2);
        saladThree.addProductInRecipe(carrot,1);

        System.out.println(
                "Общая стоимость продуктов из рецепта: \"" + salad.getNameRecipe() + "\": "
                        + salad.getCostOfProducts() + " рублей");
        System.out.println(
                "Общая стоимость продуктов из рецепта: \"" + saladTwo.getNameRecipe() + "\": "
                        + saladTwo.getCostOfProducts() + " рублей");
        System.out.println(
                "Общая стоимость продуктов из рецепта: \"" + saladThree.getNameRecipe() + "\": "
                        + saladThree.getCostOfProducts() + " рублей");
        System.out.println();

        Set<Integer> integerSet = new HashSet<>();
        generateRandom(integerSet);
        System.out.println("Рандомные двадцать чисел: " + integerSet);
        List<Integer> integerList = new ArrayList<>();
        getEvenNumbers(integerSet, integerList);
        System.out.println("Оставшиеся четные числа из рандомных: " + integerList);

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.addTelephoneOfPerson("Артур Иванов","89273456789");
        telephoneDirectory.addTelephoneOfPerson("Петр Сидоров","89373357789");
        telephoneDirectory.addTelephoneOfPerson("Николай Соболев","89973496789");
        telephoneDirectory.addTelephoneOfPerson("Арсен Арзуманян","89873455889");
        telephoneDirectory.addTelephoneOfPerson("Эдуард Суровый","89073866780");
        telephoneDirectory.addTelephoneOfPerson("Максим Кожевников","82973456489");
        telephoneDirectory.addTelephoneOfPerson("Юлия Сергеева","89053756889");
        telephoneDirectory.addTelephoneOfPerson("Наталья Июльская","89593256780");
        telephoneDirectory.addTelephoneOfPerson("Рената Майская","89373156689");
        telephoneDirectory.addTelephoneOfPerson("Юлия Савичева","89373453783");
        telephoneDirectory.addTelephoneOfPerson("Сергей Леонидович","89273456782");
        telephoneDirectory.addTelephoneOfPerson("Иван Герасимов","89273456781");
        telephoneDirectory.addTelephoneOfPerson("Альберт Эдуардович","89873456780");
        telephoneDirectory.addTelephoneOfPerson("Олег Валентинович","89873456789");
        telephoneDirectory.addTelephoneOfPerson("Игорь Сергеевич","89553456789");
        telephoneDirectory.addTelephoneOfPerson("Жанна Виссарионовна","89373785789");
        telephoneDirectory.addTelephoneOfPerson("Никита Покров","89073456745");
        telephoneDirectory.addTelephoneOfPerson("Юрий Могучий","89173256759");
        telephoneDirectory.addTelephoneOfPerson("Евгений Васильевич","89373556889");
        telephoneDirectory.addTelephoneOfPerson("Татьяна Петровна","89573452789");

        System.out.println(telephoneDirectory);

        CollectionMapStringInteger collectionMapStringInteger= new CollectionMapStringInteger();
        collectionMapStringInteger.addMap("Str1", 2);
        collectionMapStringInteger.addMap("Str2", 1);
        collectionMapStringInteger.addMap("Str1", 5);
        System.out.println(collectionMapStringInteger);
    }


    public static void getEvenNumbers(Set<Integer> integerSet, List<Integer> integerList) {
        for (Integer integer : integerSet) {
            if (integer % 2 == 0) {
                integerList.add(integer);
            }
        }
    }

    public static void generateRandom(Set<Integer> integerSet) {
        Random random = new Random();
        int i = 0;
        while (i < 20) {
            integerSet.add(random.nextInt(1000));
            i++;
        }
    }


}
