package ss9_bai_tap_them.model;

public class Car extends Transportation{
    private String numberOfSeats;
    private String typeCar;

    public Car() {
    }

    public Car(String seaOfControl, String manufacturersName, String year, String owner, String numberOfSeats, String typeCar) {
        super(seaOfControl, manufacturersName, year, owner);
        this.numberOfSeats = numberOfSeats;
        this.typeCar = typeCar;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "numberOfSeats='" + numberOfSeats + '\'' +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }
}
