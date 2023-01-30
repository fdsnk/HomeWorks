package pro.sky.course1.lesson4;

public class T3_School {
    public static void main(String[] args) {
        /*
        Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
         */
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int allStudents = firstClass + secondClass + thirdClass;
        int allSheets = 480;
        int sheetsPerStudents = allSheets / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudents + " листов бумаги");
    }
}
