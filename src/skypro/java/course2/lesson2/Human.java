package skypro.java.course2.lesson2;

public class Human {
    /*
    * Для полей класса, в которых хранится информация о городе проживания и дате рождения,
    * настройте доступ private и напишите геттеры и сеттеры для данных полей.
    * Перепишите раннее созданные проверки данных в поле сеттера:
- Программа сначала проверяет, что поле города проживания не пустое, не равно null.
- Если данные пустые или равны null, программа ставит значение по умолчанию, равное “Информация не указана”.
- Программа проверяет, что поле дата рождения не отрицательное и не пустое.
- Если данные пустые или отрицательные, программа ставит значение по умолчанию, равное нулю.
Создайте новый объект со следующими характеристиками:
Владимир, которому 21 год, живет в Казани, сейчас нигде не работает.
     */

        private int yearOfBirth;
        private String name;
        private String town;
        private String jobTitle;

        private final String INFO_IS_NOT = "---информация не указана---";

        public Human(String name, String town, int yearOfBirth, String jobTitle) {
            if (name != null && !name.isEmpty() && !name.isBlank()) {
                this.name = name;
            }  else {
                this.name = INFO_IS_NOT;
            }
            if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
                this.jobTitle = jobTitle;
            } else {
                this.jobTitle = INFO_IS_NOT;
            }
            if (town != null && !town.isEmpty() && !town.isBlank()) {
                this.town = town;
            } else {
                this.town = INFO_IS_NOT;
            }
            if (yearOfBirth >= 0) {
                this.yearOfBirth = yearOfBirth;
            } else {
                this.yearOfBirth = 0;
            }
        }

        @Override
        public String toString() {
            return "Привет! " +
                    "Меня зовут " + name + ". Я из города " +
                    town + ". Я родился в " + yearOfBirth +
                    " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
        }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = INFO_IS_NOT;
        }
    }
}

