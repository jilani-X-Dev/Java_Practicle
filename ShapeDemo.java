abstract class Shape {

    String name;

    Shape(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Shape: " + name);
    }

    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double l, double b) {
        super("Rectangle");
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {

    double a, b, c;

    Triangle(double a, double b, double c) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double area() {
        double s = perimeter() / 2;

        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    double perimeter() {
        return a + b + c;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 4, 5);

        Shape[] shapes = {s1, s2, s3};

        for (Shape s : shapes) {
            s.display();
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter());
            System.out.println();
        }
    }
}