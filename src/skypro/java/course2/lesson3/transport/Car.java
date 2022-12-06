package skypro.java.course2.lesson3.transport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Transport {
    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registerNumber;
    private final int numberOfSeats;
    private boolean summerTires; // 1 - лето; 0 - зима.
//    private static final String DEFAULT = "...default...";

//    public static String validateString(String needsValidate) {
//        needsValidate = (needsValidate != null && !needsValidate.isEmpty() && !needsValidate.isBlank() ? needsValidate : DEFAULT);
//        return needsValidate;
//    }

    public Car(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed,float engineVolume,
               String transmission, String bodyType, String registerNumber, int numberOfSeats, boolean summerTires) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        this.bodyType = validateString(bodyType);
        setRegisterNumber(registerNumber);
        this.numberOfSeats = (numberOfSeats > 0 ? numberOfSeats : 2);
        this.summerTires = summerTires;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d года выпуска, страна сборки: %s, цвет кузова: %s, максимальная скорость передвижения: %d км/ч, " +
                        "объем двигателя: %.1f литра, тип кузова: %s, %s,  регистрационный номер: %s, " +
                        "количество мест: %d, %s резина.", getBrand(), getModel(), getProdYear(), getProdCountry(), getColor(), getMaxSpeed(),
                engineVolume, bodyType, transmission, registerNumber, numberOfSeats, isSummerTires() ? "летняя" : "зимняя");
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = (engineVolume >= 0 ? engineVolume : 1.5f);
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission != null && !transmission.isEmpty() && !transmission.isBlank() ? transmission : "МКПП");
    }

    public void setRegisterNumber(String registerNumber) {
        String correctNumber = registerNumber.toLowerCase();
        correctNumber = correctNumber.replace(" ", "");

        String regex = "^[АВЕКМНОРСТУХавекмнорстух]{1}[0-9]{3}[АВЕКМНОРСТУХавекмнорстух]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correctNumber);

        if (correctNumber == null || correctNumber.trim().isEmpty()) {
            this.registerNumber = "...отсутствует...";
        } else if (matcher.matches() == true) {
            this.registerNumber = correctNumber;
        } else if (matcher.matches() == false) {
            this.registerNumber = "введен не корректно";
        } else {
            this.registerNumber = correctNumber;
        }
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
}
