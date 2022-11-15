package skypro.java.course1.lesson11;

public class Strings {
    public static void main(String[] args) {

        System.out.println("Задача 1.\n");
        /*
         * Напишите четыре строки:первая с именем firstName — для хранения имени;
         * вторая с именем middleName — для хранения отчества;
         * третья с именем lastName — для хранения фамилии;
         * четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
         * Выведите в консоль фразу: “ФИО сотрудника — ….”
         * В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s", fullName);

        System.out.println("\n\nЗадача 2.\n");
        /*
         * Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich”
         * на полностью заглавные буквы. Результат программы выведите в консоль в формате:
         *  ”Данные ФИО сотрудника для заполнения отчета — …”
         */
        fullName = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s", fullName);

        System.out.println("\n\nЗадача 3.\n");
        /*
         * Нужно написать программу, которая заменяет символ “ё” на символ “е”.
         * Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
         */
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.printf("Данные ФИО сотрудника — %s", fullName);

    }
}
