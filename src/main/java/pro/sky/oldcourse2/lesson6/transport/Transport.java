package pro.sky.oldcourse2.lesson6.transport;

import pro.sky.oldcourse2.lesson6.Validate_String;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;

    private float engineVolume;
    private boolean diagnosticsPassed;

    public Transport(String brand, String model, float engineVolume, boolean diagnosticsPassed) {
        this.brand = Validate_String.validateString(brand);
        this.model = Validate_String.validateString(model);
        this.diagnosticsPassed = diagnosticsPassed;
        setEngineVolume(engineVolume);

    }
    public boolean isDiagnosticsPassed() {
        return diagnosticsPassed;
    }

    public abstract void go();
    public abstract void stop();

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = (engineVolume >= 0 ? engineVolume : 1.5f);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract boolean passDiagnostics();

    public abstract void printType();
    @Override
    public String toString() {
        return String.format("%s %s, объем двигателя %.1f литров.",
                getBrand(), getModel(), getEngineVolume());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}