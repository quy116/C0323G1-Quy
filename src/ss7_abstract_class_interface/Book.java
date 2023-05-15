package ss7_abstract_class_interface;

public abstract class Book {
    private String name;
    private String publishingCompany;
    private String year;

    public Book() {
    }

    public Book(String name, String publishingCompany, String year) {
        this.name = name;
        this.publishingCompany = publishingCompany;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
