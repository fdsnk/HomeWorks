package pro.sky.course2.lesson2.transport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private final String color;
    private final int prodYear;
    private final String prodCountry;
    private String transmission;
    private final String bodyType;
    private String registerNumber;
    private final int numberOfSeats;
    private boolean summerTires; // 1 - лето; 0 - зима.
    private static final String DEFAULT = "...default...";
    private final String DEFAULT_COLOR = "белый";

    //    private Key key;
//    private Insurance insurance;
    public static String validateString(String needsValidate) {
        needsValidate = (needsValidate != null && !needsValidate.isEmpty() && !needsValidate.isBlank() ? needsValidate : DEFAULT);
        return needsValidate;
    }

    public Car(String brand, String model, int prodYear, String prodCountry, String color, float engineVolume, String transmission,
               String bodyType, String registerNumber, int numberOfSeats, boolean summerTires) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        this.prodYear = (prodYear > 0 ? prodYear : 2000);
        this.prodCountry = validateString(prodCountry);
        this.color = validateString(color);
        this.engineVolume = (engineVolume > 0 ? engineVolume : 1.5f);
        this.transmission = (transmission != null && !transmission.isEmpty() && !transmission.isBlank() ? transmission : "МКПП");
        this.bodyType = validateString(bodyType);
//        this.registerNumber = (registerNumber != null && !registerNumber.isEmpty() && !registerNumber.isBlank() ? registerNumber : "х000хх000");
        this.registerNumber = registerNumber;
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
        this.numberOfSeats = (numberOfSeats > 0 ? numberOfSeats : 2);
        this.summerTires = summerTires;
    }

    @Override
    public String toString() {
        return String.format("%s %s, страна сборки: %s, цвет и тип кузова: %s %s, объем двигателя: %.1f литра, " +
                        "год выпуска: %d, %s, регистрационный номер: %s, количество мест: %d, %s резина.",
                brand, model, prodCountry, color, bodyType, engineVolume, prodYear, transmission, registerNumber,
                numberOfSeats, isSummerTires() ? "летняя" : "зимняя");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProdYear() {
        return prodYear;
    }

    public String getProdCountry() {
        return prodCountry;
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
