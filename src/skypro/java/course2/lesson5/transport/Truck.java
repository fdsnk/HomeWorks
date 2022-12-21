package skypro.java.course2.lesson5.transport;

public class Truck extends Transport implements Competing{
    private final String TYPE = "Грузовой автомобиль.";
    private final LoadCapacity loadCapacity;
    public Truck(String brand, String model, float engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public String getTYPE() {
        return TYPE;
    }

    public enum LoadCapacity {
        N1(0f, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.0f, 0f);
        private final float lowerBound;
        private final float upperBound;

        LoadCapacity(Float lowerBound, Float upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public float getLowerBound() {
            return lowerBound;
        }

        public float getUpperBound() {
            return upperBound;
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
    public void printType() {
        if (getTYPE() != null && !getTYPE().isEmpty() && !getTYPE().isBlank()) {
            System.out.printf("%s %s - %s \n",getBrand(), getModel(), getTYPE());
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
        if (loadCapacity.lowerBound == 0f) {
            return String.format("%s %s, объем двигателя %.1f литров. Грузоподъемность до %.1f тонн.",
                    getBrand(), getModel(), getEngineVolume(), loadCapacity.getUpperBound());
        } else if (loadCapacity.upperBound == 0f) {
            return String.format("%s %s, объем двигателя %.1f литров. Грузоподъемность свыше %.0f тонн.",
                    getBrand(), getModel(), getEngineVolume(), loadCapacity.getLowerBound());
        } else {
            return String.format("%s %s, объем двигателя %.1f литров. Грузоподъемность свыше %.1f до %.0f тонн.",
                    getBrand(), getModel(), getEngineVolume(), loadCapacity.getLowerBound(), loadCapacity.getUpperBound());
        }
    }
}
