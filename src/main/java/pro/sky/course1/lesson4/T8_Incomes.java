package pro.sky.course1.lesson4;

public class T8_Incomes {
    public static void main(String[] args) {
        /*
        Маша получает 67 760 рублей в месяц
        Денис получает 83 690 рублей в месяц
        Кристина получает 76 230 рублей в месяц
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
         */
        // Зарплата до повышения
        float salaryMashaPerMonth = 67760f; // Зарплата в месяц до повышения
        float salaryMashaYear = salaryMashaPerMonth * 12; // Зарплата за год до повышения
        float salaryDenisPerMonth = 83690f; // Зарплата в месяц до повышения
        float salaryDenisYear = salaryDenisPerMonth * 12; // Зарплата за год до повышения
        float salaryKristinaPerMonth = 76230f; // Зарплата в месяц до повышения
        float salaryKristinaYear = salaryKristinaPerMonth * 12; // Зарплата за год до повышения
        // Зарплата после после повышения
        float increaseMashaPerMonth = salaryMashaPerMonth * 0.1f; // Размер повышения зарплаты на 10 % в месяц
        float increaseMashaPerYear = salaryMashaYear * 0.1f; // Размер повышения зарплаты на 10 % за год
        salaryMashaPerMonth = salaryMashaPerMonth + increaseMashaPerMonth; // Зарплата в месяц после повышения на 10 %
        System.out.println("Маша теперь получает " + salaryMashaPerMonth + " рублей. " +
                "Годовой доход вырос на " + increaseMashaPerYear + " рублей.");

        float increaseDenisPerMonth = salaryDenisPerMonth * 0.1f; // Размер повышения зарплаты на 10 % в месяц
        float increaseDenisPerYear = salaryDenisYear * 0.1f; // Размер повышения зарплаты на 10 % за год
        salaryDenisPerMonth = salaryDenisPerMonth + increaseDenisPerMonth; // Зарплата в месяц после повышения на 10 %
        System.out.println("Денис теперь получает " + salaryDenisPerMonth + " рублей. " +
                "Годовой доход вырос на " + increaseDenisPerYear + " рублей.");

        float increaseKristinaPerMonth = salaryKristinaPerMonth * 0.1f; // Размер повышения зарплаты на 10 % в месяц
        float increaseKristinaPerYear = salaryKristinaYear * 0.1f; // Размер повышения зарплаты на 10 % за год
        salaryKristinaPerMonth = salaryKristinaPerMonth + increaseKristinaPerMonth; // Зарплата в месяц после повышения на 10 %
        System.out.println("Кристина теперь получает " + salaryKristinaPerMonth + " рублей. " +
                "Годовой доход вырос на " + increaseKristinaPerYear + " рублей.");
    }
}
