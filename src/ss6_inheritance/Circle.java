package ss6_inheritance;

public class Circle { // day la lop cha : la thanh phan ko dc ke thua
    private double radius;
    // khong ke thua dc
    private String color;
    // khong ke thua dc

    public Circle() { // day la overload
    }

    public Circle(double radius, String color) { // day la overload
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    // ke thua dc

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // ke thua dc

    public String getColor() {
        return color;
    }
    // ke thua dc

    public void setColor(String color) {
        this.color = color;
    }
    // ke thua dc
    public double getArea(){
        return  Math.pow(this.radius, 2) * Math.PI;
    }
    // ke thua dc

    @Override
    public String toString() { // day la overide
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
