package skypro.java.course2.lesson3.transport;

public class Transport {
    private String brand;
    private String model;
    private String color;
    private int prodYear;
    private String prodCountry;
    private int maxSpeed;

    private static final String DEFAULT = "...default...";
//    private final String DEFAULT_COLOR = "белый";

    public static String validateString(String needsValidate) {
        needsValidate = (needsValidate != null && !needsValidate.isEmpty() && !needsValidate.isBlank() ? needsValidate : DEFAULT);
        return needsValidate;
    }

    public Transport(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed) {
        this.brand = validateString(brand);
        this.model = validateString(model);
        this.prodYear = (prodYear > 0 ? prodYear : 2000);
        this.prodCountry = validateString(prodCountry);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

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
        this.color = validateString(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed > 0 ? maxSpeed : 90);
    }
}