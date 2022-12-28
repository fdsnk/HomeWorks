package skypro.java.course2.lesson6.transport;

public class Car extends Transport implements Competing {
    private final BodyType bodyType;
    private final String TYPE = "Легковой автомобиль.";

    public Car(String brand, String model, float engineVolume, boolean diagnosticsPassed, BodyType bodyType) {
        super(brand, model, engineVolume, diagnosticsPassed);
        this.bodyType = bodyType;
    }

    public String getTYPE() {
        return TYPE;
    }

    //    public enum Type {
//        CAR("Легковой автомобиль.");
//
//        private final String type;
//
//        Type(String type) {
//            this.type = type;
//        }
//
//        public String getType() {
//            return type;
//        }
//    }
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String rusBodyType;

        BodyType(String rusBodyType) {
            this.rusBodyType = rusBodyType;
        }

        public String getRusBodyType() {
            return rusBodyType;
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
        return this.isDiagnosticsPassed();
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
        return String.format("%s %s, объем двигателя %.1f литров.Тип кузова: %s.",
                getBrand(), getModel(), getEngineVolume(), bodyType.getRusBodyType());
    }
}
