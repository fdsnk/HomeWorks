package skypro.java.course2.lesson4.transport;

import skypro.java.course2.lesson4.Validate_String;

public abstract class Transport {
    private String brand;
    private String model;

    private float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = Validate_String.validateString(brand);
        this.model = Validate_String.validateString(model);
        setEngineVolume(engineVolume);

    }

    public abstract void go();
    public abstract void stop();

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = (engineVolume >= 0 ? engineVolume : 1.5f);
    }

    @Override
    public String toString() {
        return String.format("%s %s, объем двигателя %.1f литра.",
                brand, model, engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }



}