package Interfaces;

public class Triangle extends Shape {

    public Triangle(String name, String color, double height, double width) {
        super(name, color, height, width);
    }

    public double getArea() {
        return 0.5 * height * width;
    }

}
