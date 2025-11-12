class Shape {
   
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayShape() {
        System.out.println("This is a Circle.");
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void displayShape() {
        System.out.println("This is a Rectangle.");
    }

    double area() {
        return length * width;
    }
}

public class ShapesDemo {
