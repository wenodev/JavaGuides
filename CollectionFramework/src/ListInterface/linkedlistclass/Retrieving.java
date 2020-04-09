package ListInterface.linkedlistclass;

import java.util.LinkedList;

public class Retrieving {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("Pinaple");

        String firstElement = fruits.getFirst();
        System.out.println("First Fruit in List : " + firstElement);

        String lastElement = fruits.getLast();
        System.out.println("Last fruit in List : " + lastElement);

        String pinapleFruit = fruits.get(2);
        System.out.println("Stock Price on 3rd Day : " + pinapleFruit);

    }
}
