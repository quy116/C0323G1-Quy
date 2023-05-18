package ss9_bai_tap_them.model;

public class Motorbike extends Transportation{
    private String Wattage;

    public Motorbike() {
    }

    public Motorbike(String seaOfControl, String manufacturersName, String year, String owner, String wattage) {
        super(seaOfControl, manufacturersName, year, owner);
        Wattage = wattage;
    }

    public String getWattage() {
        return Wattage;
    }

    public void setWattage(String wattage) {
        Wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorbike{" + super.toString() +
                "Wattage='" + Wattage + '\'' +
                '}';
    }
}
