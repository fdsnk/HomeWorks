package pro.sky.oldcourse2.lesson7.sponsor;

public class Sponsor {
    private final String name;
    private int amountOfSupport;

    public Sponsor(String name, int amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    public void toSponsorRace(){
        System.out.printf("Спонсор %s проспонсировал гонку на %d%n", name, amountOfSupport);
    }
}
