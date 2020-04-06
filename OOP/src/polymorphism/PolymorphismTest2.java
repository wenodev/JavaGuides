package polymorphism;

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}

public class PolymorphismTest2 {

    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle();
        shape.draw();

        shape = new Circle();
        shape.draw();

        shape = new Shape();
        shape.draw();

    }

}
