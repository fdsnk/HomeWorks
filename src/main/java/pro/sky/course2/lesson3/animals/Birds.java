package pro.sky.course2.lesson3.animals;

import pro.sky.course2.lesson3.Validate_String;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public void hunting() {
        System.out.println(getName() + " охотится");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validate_String.validateString(livingEnvironment);
    }
    public static class Flightless extends Birds {
        private String typeOfMovement;

        public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
            super(name, age, livingEnvironment);
            setTypeOfMovement(typeOfMovement);
        }
        public void walk() {
            System.out.println(getName() + " гуляет");
        }
        public String getTypeOfMovement() {
            return typeOfMovement;
        }

        public void setTypeOfMovement(String typeOfMovement) {
            this.typeOfMovement = Validate_String.validateString(typeOfMovement);
        }
        @Override
        public String toString() {
            return '\n' + "Птица: " + getName() + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: Птицы, подкласс: Нелетающие" + '\n' +
                    "Среда обитания:" + getLivingEnvironment() + '\n' +
                    "Тип передвижения: " + getTypeOfMovement();
        }
    }
    public static class Flying extends Birds {
        private String typeOfMovement;

        public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
            super(name, age, livingEnvironment);
            setTypeOfMovement(typeOfMovement);
        }
        public void fly() {
            System.out.println(getName() + " летает");
        }
        public String getTypeOfMovement() {
            return typeOfMovement;
        }

        public void setTypeOfMovement(String typeOfMovement) {
            this.typeOfMovement = Validate_String.validateString(typeOfMovement);
        }
        @Override
        public String toString() {
            return '\n' + "Птица: " + getName() + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: Птицы, подкласс: Летающие" + '\n' +
                    "Среда обитания:" + getLivingEnvironment() + '\n' +
                    "Тип передвижения: " + getTypeOfMovement();
        }
    }
}
