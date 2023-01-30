package pro.sky.course2.lesson7.transport;

public class Bus extends Transport implements Competing {
    private final String TYPE = "Автобус.";
    private final Capacity capacity;

    public Bus(String brand, String model, float engineVolume, boolean diagnosticsPassed, Capacity capacity) {
        super(brand, model, engineVolume, diagnosticsPassed);
        this.capacity = capacity;
    }

    public String getTYPE() {
        return TYPE;
    }

    public enum Capacity {
        ESPECIALLY_SMALL(0, 10),
        SMALL(10, 25),
        AVERAGE(40, 50),
        LARGE(60, 80),
        ESPECIALLY_LARGE(100, 120);

        private final int lower;
        private final int upper;

        Capacity(int lower, int upper) {
            this.lower = lower;
            this.upper = upper;
        }

        public int getLower() {
            return lower;
        }

        public int getUpper() {
            return upper;
        }
    }

    @Override
    public void go() {
        System.out.printf("%s %s - Поехали! \n", getBrand(), getModel());
    }

    @Override
    public void stop() {
        System.out.printf("%s %s - Тормозим! \n", getBrand(), getModel());

    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобусы не могут проходить диагностику!");
        return false;
    }

    @Override
    public void passRepair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена!");

    }

    @Override
    public void printType() {
        if (getTYPE() != null && !getTYPE().isEmpty() && !getTYPE().isBlank()) {
            System.out.printf("%s %s - %s \n", getBrand(), getModel(), getTYPE());
        } else {
            System.out.println("Данных по транспортному средству недостаточно.");
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s - На пит-стоп! \n", getBrand(), getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время круга - %s %s: %.0f мин. %.0f сек. \n", getBrand(), getModel(),
                (1 + Math.random() * (20)), Math.random() * 59);
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость - %s %s: %.0f км/ч \n", getBrand(), getModel(),
                (100 + Math.random() * (100)));
    }

    @Override
    public String toString() {
        if (capacity.lower == 0) {
            return String.format("%s %s, объем двигателя %.1f литров. Вместимость до %d мест.",
                    getBrand(), getModel(), getEngineVolume(), capacity.getUpper());
        } else {
            return String.format("%s %s, объем двигателя %.1f литров. Вместимость от %d до %d мест.",
                    getBrand(), getModel(), getEngineVolume(), capacity.getLower(), capacity.getUpper());
        }
    }
}
