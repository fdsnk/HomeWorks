package pro.sky.course2.practice.lesson14;

public class StudentValueGenerator {
    private static int DEFAULT_MAX = 100;
    private static int DEFAULT_MIN = 1;

    public int generateAgeInRange(int min, int max) {
        return (int) ((Math.random() * (min-max)) + min);
    }

    public int generateAge() {
        return generateAgeInRange(DEFAULT_MIN, DEFAULT_MAX);
    }
}
