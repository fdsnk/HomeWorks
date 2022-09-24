package skypro.java.course1.lesson4;

public class T5_Repair {
    public static void main(String[] args) {
        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате
        “В школе, где … классов, нужно … банок белой краски и … банок коричневой краски”.
         */
        int totalCansOfPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int classesAtSchool = totalCansOfPaint / (whitePaint + brownPaint);
        whitePaint = whitePaint * classesAtSchool;
        brownPaint = brownPaint * classesAtSchool;

        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски.");
    }
}
