package ss9_danh_sach.model;

public class Fruit {
    private String nameFruit;
    private String kindOfFruit;
    private String dateOfManufacture;
    private String expiry;
    private String price;

    public Fruit() {
    }

    public Fruit(String nameFruit, String kindOfFruit, String dateOfManufacture, String expiry, String price) {
        this.nameFruit = nameFruit;
        this.kindOfFruit = kindOfFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.price = price;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getKindOfFruit() {
        return kindOfFruit;
    }

    public void setKindOfFruit(String kindOfFruit) {
        this.kindOfFruit = kindOfFruit;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", kindOfFruit='" + kindOfFruit + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expiry='" + expiry + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    public String readToFile() {
        return this.nameFruit +","+ this.kindOfFruit + "," +this.dateOfManufacture +","+ this.expiry + "," + this.price;
    }
}
