package pro.sky.course2.lesson3.transport;

import pro.sky.course2.lesson3.Validate_String;

abstract class Transport {
    private String brand;
    private String model;
    private String color;
    private int prodYear;
    private String prodCountry;
    private int maxSpeed;

    public Transport(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
        this.brand = Validate_String.validateString(brand);
        this.model = Validate_String.validateString(model);
        this.prodYear = (prodYear > 0 ? prodYear : 2000);
        this.prodCountry = Validate_String.validateString(prodCountry);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public abstract void refill();

    @Override
    public String toString() {
        return String.format("%s %s, %d года выпуска, страна сборки: %s, цвет кузова: %s, максимальная скорость передвижения: %d км/ч,",
                brand, model, prodYear, prodCountry, color, maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = Validate_String.validateString(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed > 0 ? maxSpeed : 90);
    }


}