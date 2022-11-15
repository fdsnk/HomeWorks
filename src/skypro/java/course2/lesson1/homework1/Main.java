package skypro.java.course2.lesson1.homework1;

import skypro.java.course1.lesson14.Book;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");

        System.out.println(maksim + "\n" + anya + "\n" + katya + "\n" + artem);

    }
}
