import java.util.ArrayList;
import java.util.List;

public class E14ListOfShapes {

    public static void main(String[] args) {
        List<Shape> list = new ArrayList<Shape>();

        // TODO: put triangles and squares into list
        list.add(new Square(5.0));
        list.add(new Triangle(3, 4));



        // print out stuff in list
        for (Shape shape : list) {
            System.out.println(shape);

            // TODO: how can we determine which subclass?
            System.out.println(shape instanceof Shape);
            System.out.println(shape.getClass().getSimpleName());
        }

    }

    public static class Shape {
        // TODO 1b: what if we write a constructor?
        public Shape(String name) {
            this.name = name;
        }

        public Shape() {
            this.name = "I am a shape";
        }

        public double area() {
            return 0;
        }

        public String toString() {
            // TODO 1c: what if we want to include field value in result?
            return "Shape base class";
        }

        // TODO 1a: what if we put a field here?
        private String name;

    }

    public static class Square extends Shape {
        public Square(double size) {
            // Implicitly call zero-argument super constructor.
            this.size = size;
        }

        public double area() {
            return size * size;
        }

        public String toString() {
            return "Square(size = " + size + ")";
        }

        private double size;
    }

    public static class Triangle extends Shape {
        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double area() {
            return 0.5 * base * height;
        }

        public String toString() {
            return "Triangle(base = " + base + ", height = " + height + ")";
        }

        private double base;
        private double height;

    }

}
