package Interfaces;

public class Rectangle extends Shape {

    public Rectangle(String name, String color, double height, double width) {
        super(name, color, height, width);
    }

    @Override
    public double getArea() {
        return height * width;
    }

}
