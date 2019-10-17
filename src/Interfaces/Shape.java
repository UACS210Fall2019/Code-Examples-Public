package Interfaces;

public abstract class Shape {

    private String name;
    private String color;
    protected double height;
    protected double width;

    public Shape(String name, String color, double height, double width) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public abstract double getArea();

}
