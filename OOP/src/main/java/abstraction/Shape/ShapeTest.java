package abstraction.Shape;

import javax.xml.bind.SchemaOutputResolver;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle("red", 2.2);
        Shape shape2 = new Rectangle("Yellow", 2, 4);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());


    }
}
