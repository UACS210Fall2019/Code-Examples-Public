package shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(String name, double height, double width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

}
