package wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class WildCardSimpleExample {
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("ArrayList Collection1");
        collection.add("ArrayList Collection2");
        printCollection(collection);

        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection1");
        collection2.add("LinkedList Collection2");
        printCollection(collection2);

        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection1");
        collection3.add("HashSet Collection2");
        printCollection(collection3);

        Collection<Integer> collection4 = new ArrayList<>();
        collection4.add(1);
        collection4.add(2);
        printCollection(collection4);

    }
}
