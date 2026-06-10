class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 5;
    double width = 4;

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius = 3;

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        System.out.println("Rectangle Area: " + s1.area());
        System.out.println("Circle Area: " + s2.area());
    }
}
