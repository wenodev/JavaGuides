package withoutStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinMethods {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);



        Product productA = productsList.stream()
                .max(comparator).get();
//                        .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get(); // same result


        System.out.println(productA.getPrice());


        Product productB = productsList.stream()
                .max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
        System.out.println(productB.getPrice());


        System.out.println();







    }
}
