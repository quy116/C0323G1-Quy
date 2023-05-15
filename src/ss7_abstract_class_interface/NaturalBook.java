package ss7_abstract_class_interface;

public class NaturalBook extends Book implements IBook{
    private String value;

    public NaturalBook() {
    }

    public NaturalBook(String name, String publishingCompany, String year, String value) {
        super(name, publishingCompany, year);
        this.value = value;
    }

    @Override
    public void display() {

    }

    @Override
    public String toString() {
        return "NaturalBook{" + super.toString() +
                "value='" + value + '\'' +
                '}';
    }
}
