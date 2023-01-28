package skypro.java.course2.lesson7.mechanic;

import skypro.java.course2.lesson7.transport.Transport;

public class Mechanic<T extends Transport> {
    private final String fullName;
    private final String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public boolean doService(T transport){
        return transport.passDiagnostics();
    }

    public void doRepair(T transport){
        transport.passRepair();
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }
}


