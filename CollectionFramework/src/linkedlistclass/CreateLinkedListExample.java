package linkedlistclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");

        System.out.println("Initial LinkedList : " + fruits);

        fruits.add(2, "watermelon");

        System.out.println("After add(2, \"D\") : " + fruits);

        fruits.addFirst("Strawberry");
        System.out.println("After addFirst(\"Strawberry\") : " + fruits);

        fruits.addLast("Orange");
        System.out.println("After addLast(\"F\") : " + fruits);

        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pyrus");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(moreFruits) : " + fruits);


    }

}
