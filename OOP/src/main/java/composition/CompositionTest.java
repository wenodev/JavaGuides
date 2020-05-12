package composition;

public class CompositionTest {

    public static void main(String[] args) {

        // Create Products
        Product p1 = new Product(1, "Pen", "This is red pen");
        Product p2 = new Product(2, "Pencil", "This is pencil");
        Product p3 = new Product(3, "ColorBox", "This is color box");

        // Create Order and Add Line Items
        Order o = new Order(1, "ORD#1");
        o.addItem(1, 2, p1); // Ordered of 2 quantity for p1 product
        o.addItem(2, 1, p2); // Ordered of 1 quantity for p2 product
        o.addItem(3, 5, p3); // Ordered of 5 quantity for p3 product

        // Print Order detail before deleting
        System.out.println("Order ---");
        System.out.println(o);

        System.out.println("========");
        System.out.println(o.getName());

        System.out.println("========");
        o.showList();


    }
}
