package ss11_collection.model;

public class Fruit {
    private String Code;
    private String name;
    private String kindOfFruit;
    private String dateOfManufacture;
    private String expiry;
    private String price;

    public Fruit() {
    }

    public Fruit(String code, String name, String kindOfFruit, String dateOfManufacture, String expiry, String price) {
        Code = code;
        this.name = name;
        this.kindOfFruit = kindOfFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", kindOfFruit='" + kindOfFruit + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expiry='" + expiry + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
