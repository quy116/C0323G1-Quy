package ss6_inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

        //
    public Cylinder(double radius, String color, double height) { // day la overload
        super(radius, color); // day la thanh phan dc ke thua
        this.height = height; // day la thanh phan ko dc ke thua
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override // day la override
    public String toString() {
        return "Cylinder{" + super.toString()+  // day ke thua
                "height=" + height +
                '}';
    }
}
