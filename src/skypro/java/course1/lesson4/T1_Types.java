package skypro.java.course1.lesson4;

public class T1_Types {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        /*
        Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более,
        должно придерживаться правила camelCase.
        Выведите в консоль значение каждой переменной в формате
        “Значение переменной … с типом … равно …”
        */
        System.out.println();
        byte typesByte = 127;
        short typesShort = 32767;
        int typesInt = 2147483647;
        long typesLong = 999_999_999_999L;
        float typesFloat = 3.14F;
        double typesDouble = 1.87777777;

        System.out.println("Значение переменной с типом byte равно " + typesByte);
        System.out.println("Значение переменной с типом short равно " + typesShort);
        System.out.println("Значение переменной с типом int равно " + typesInt);
        System.out.println("Значение переменной с типом long равно " + typesLong);
        System.out.println("Значение переменной с типом float равно " + typesFloat);
        System.out.println("Значение переменной с типом double равно " + typesDouble);
        System.out.println();

        System.out.println("Задача 2");
        /*
        Инициализируйте переменные, используя изученные ранее типы переменных.
        Значения:
        27.12 ,  987 678 965 549 , 2, 786 , false, 569 , -159 , 27897 , 67.
         */
        System.out.println();
        typesByte = 67;
        typesInt = 27897;
        typesShort = 569;
        short shortNumber = -159;
        typesLong = 987_678_965_549L;
        typesFloat = 27.12f;
        typesDouble = 2.786;
        boolean threeApples = 5 < 1;

        System.out.println("Теперь значение переменной с типом byte равно " + typesByte);
        System.out.println("Теперь значение переменной с типом short равно " + typesShort);
        System.out.println("Ещё одна переменная с типом short - значение равно " + shortNumber);
        System.out.println("Теперь значение переменной с типом int равно " + typesInt);
        System.out.println("Теперь значение переменной с типом long равно " + typesLong);
        System.out.println("Теперь значение переменной с типом float равно " + typesFloat);
        System.out.println("Теперь значение переменной с типом double равно " + typesDouble);
        System.out.println("Пять меньше одного, это конечно же " + threeApples);

    }
}
