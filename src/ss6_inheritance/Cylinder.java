package ss6_inheritance;

public class Cylinder extends Circle{
    private double height;
    // day la khong ke thua dc

    public Cylinder() {// day la overload
    }

        //
    public Cylinder(double radius, String color, double height) { // day la overload
        super(radius, color); // day la thanh phan dc ke thua
        this.height = height; // day la thanh phan ko dc ke thua
    }

    public double getHeight() {
        return height;
    }
    // day la ke thua dc

    public void setHeight(double height) {
        this.height = height;
    }
    // day la ke thua dc
    public double getVolume(){
        return super.getArea() * this.height;
    }
    // day la ke thua dc

    @Override // day la override
    public String toString() {
        return "Cylinder{" + super.toString()+  // day ke thua
                "height=" + height +
                '}';
    }
}
