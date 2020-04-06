package abstraction.Shape;


public class Rectangle extends Shape{

    double length;
    double width;



    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("Rectangle Constructor called");
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.color + "and area is : " + area();
    }
}
