package ss9_bai_tap_them.model;

public class Truck extends Transportation{
    private String referee;

    public Truck() {
    }

    public Truck(String seaOfControl, String manufacturersName, String year, String owner, String referee) {
        super(seaOfControl, manufacturersName, year, owner);
        this.referee = referee;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "referee='" + referee + '\'' +
                '}';
    }
}
