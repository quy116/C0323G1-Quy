package ss7_abstract_class_interface;

public class SocialBook extends Book implements IBook {
    public SocialBook() {
    }

    public SocialBook(String name, String publishingCompany, String year) {
        super(name, publishingCompany, year);
    }

    @Override
    public void display() {
        System.out.println( "SocialBook{" + super.toString() +
                '}');
    }

    @Override
    public String toString() {
        return "SocialBook{}" + super.toString();
    }
}
