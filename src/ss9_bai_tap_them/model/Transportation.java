package ss9_bai_tap_them.model;

public abstract class Transportation {
    private String seaOfControl;
    private String manufacturersName;
    private String year;
    private String owner;

    public Transportation() {
    }

    public Transportation(String seaOfControl, String manufacturersName, String year, String owner) {
        this.seaOfControl = seaOfControl;
        this.manufacturersName = manufacturersName;
        this.year = year;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturersName() {
        return manufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        this.manufacturersName = manufacturersName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "seaOfControl='" + seaOfControl + '\'' +
                ", manufacturersName='" + manufacturersName + '\'' +
                ", year='" + year + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
