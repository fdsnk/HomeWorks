package pro.sky.oldcourse2.lesson3.animals;

import pro.sky.oldcourse2.lesson3.Validate_String;

public class Mammals extends Animals {
    private String livingEnvironment;
    private int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Validate_String.validateString(livingEnvironment);
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = (movementSpeed > 0 ? movementSpeed : 1);
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается");
    }

    public static class Herbivores extends Mammals {
        private String typeOfFood;

        public Herbivores(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
            super(name, age, livingEnvironment, movementSpeed);
            setTypeOfFood(typeOfFood);
        }

        public void pasture() {
            System.out.println(getName() + " пасется");
        }

        public String getTypeOfFood() {
            return typeOfFood;
        }

        public void setTypeOfFood(String typeOfFood) {
            this.typeOfFood = Validate_String.validateString(typeOfFood);
        }

        @Override
        public String toString() {
            return '\n' + "Животное: " + getName() + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: Млекопитающее, подкласс: Травоядное" + '\n' +
                    "Тип пищи: " + getTypeOfFood() + '\n' +
                    "Среда обитания:" + getLivingEnvironment() + '\n' +
                    "Скорость перемещения: " + getMovementSpeed() + "км/ч";
        }
    }

    public static class Predators extends Mammals {
        private String typeOfFood;

        public Predators(String nickname, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
            super(nickname, age, livingEnvironment, movementSpeed);
            setTypeOfFood(typeOfFood);
        }

        public void hunting() {
            System.out.println(getName() + " охотится");
        }

        public String getTypeOfFood() {
            return typeOfFood;
        }

        public void setTypeOfFood(String typeOfFood) {
            this.typeOfFood = Validate_String.validateString(typeOfFood);
        }

        @Override
        public String toString() {
            return '\n' + "Животное: " + getName() + '\n' +
                    "Возраст: " + getAge() + " лет" + '\n' +
                    "Класс: Млекопитающее, подкласс: Хищное" + '\n' +
                    "Тип пищи: " + getTypeOfFood() + '\n' +
                    "Среда обитания:" + getLivingEnvironment() + '\n' +
                    "Скорость перемещения: " + getMovementSpeed() + "км/ч";
        }
    }

    public static class Flightless extends Birds {
        private String typeOfMovement;

        public Flightless(String nickname, int age, String livingEnvironment, String typeOfMovement) {
            super(nickname, age, livingEnvironment);
            setTypeOfMovement(typeOfMovement);
        }

        public String getTypeOfMovement() {
            return typeOfMovement;
        }

        public void setTypeOfMovement(String typeOfMovement) {
            this.typeOfMovement = Validate_String.validateString(typeOfMovement);
        }
    }
}
