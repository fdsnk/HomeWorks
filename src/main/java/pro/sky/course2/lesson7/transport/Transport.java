package pro.sky.course2.lesson7.transport;

import pro.sky.course2.lesson7.Validate_String;
import pro.sky.course2.lesson7.drivers.Driver;
import pro.sky.course2.lesson7.drivers.DriverB;
import pro.sky.course2.lesson7.mechanic.Mechanic;
import pro.sky.course2.lesson7.sponsor.Sponsor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;

    private float engineVolume;
    private boolean diagnosticsPassed;

    private List<Driver> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

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
    public abstract void passRepair();
    public void addDriver (Driver driver) {
        drivers.add(driver);
    }
    public void addMechanic (Mechanic<?> ... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor (Sponsor...sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

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