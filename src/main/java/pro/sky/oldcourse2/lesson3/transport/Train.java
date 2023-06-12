package pro.sky.oldcourse2.lesson3.transport;

import pro.sky.oldcourse2.lesson3.Validate_String;

public class Train extends Transport {
    private int priceTrip;
    private int timeTrip;
    private String departureStation;
    private String finalStation;
    private int numberOfWagons;

    public Train(String brand, String model, int prodYear, String prodCountry, String color, int maxSpeed, int priceTrip, int timeTrip,
                 String departureStation, String finalStation, int numberOfWagons) {
        super(brand, model, prodYear, prodCountry, color, maxSpeed);
        setPriceTrip(priceTrip);
        setTimeTrip(timeTrip);
        setDepartureStation(departureStation);
        setFinalStation(finalStation);
        setNumberOfWagons(numberOfWagons);
    }

    @Override
    public void refill() {
        System.out.println("Объекты класса train нужно заправлять дизелем.");
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d года выпуска, страна сборки: %s, цвет кузова: %s, максимальная скорость передвижения: %d км/ч, " +
                        "цена поездки: %d руб., время поездки: %d минут, станция отправления: %s, станция прибытия: %s, " +
                        "количество вагонов: %d.", getBrand(), getModel(), getProdYear(), getProdCountry(), getColor(), getMaxSpeed(),
                priceTrip, timeTrip, departureStation, finalStation, numberOfWagons);
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = (priceTrip >= 0 ? priceTrip : 1);
    }

    public int getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(int timeTrip) {
        this.timeTrip = (timeTrip >= 0 ? timeTrip : 60);
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = Validate_String.validateString(departureStation);
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = Validate_String.validateString(finalStation);
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = (numberOfWagons >= 0 ? numberOfWagons : 1);
    }

}
