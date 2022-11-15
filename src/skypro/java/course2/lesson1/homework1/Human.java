package skypro.java.course2.lesson1.homework1;

public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! " +
                "Меня зовут " + name + ". Я из города " +
                town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
