package shapes;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String toString() {
        return "I am a shape";
    }

    public abstract double getArea();

}
