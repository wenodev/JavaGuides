package mapinterface.hashmapclass;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapTest {

    private static void collectionViewsDemo() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");


        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> entry = map.entrySet();
        System.out.println(entry);

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        for (Map.Entry<String, String> pair : entry) {
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }
    }

    private static void multipleMapDemo() {
        Map<String, List<String>> multimap = new HashMap<>();
        List<String> multiValueList = new ArrayList<>();

        multiValueList.add("value1");
        multiValueList.add("value2");
        multiValueList.add("value3");

        multimap.put("key1", multiValueList);
        System.out.println(multimap);



        multimap.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v.get(0));
        });


        Set<Map.Entry<String, List<String>>> entry = multimap.entrySet();

        for (Map.Entry<String, List<String>> pair : entry) {
            System.out.println(pair.getKey());
            System.out.println(pair.getValue().get(0));
        }
    }

    public static void forEachWithMap1() {

        // Before Java 8, how to loop map
        final Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person(100, "Ramesh"));
        map.put(2, new Person(100, "Ram"));
        map.put(3, new Person(100, "Prakash"));
        map.put(4, new Person(100, "Amir"));
        map.put(5, new Person(100, "Sharuk"));

        for (final Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getValue().getAge());
        }
    }

    public static void forEachWithMap2() {

        // Before Java 8, how to loop map
        final Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person(100, "Ramesh"));
        map.put(2, new Person(100, "Ram"));
        map.put(3, new Person(100, "Prakash"));
        map.put(4, new Person(100, "Amir"));
        map.put(5, new Person(100, "Sharuk"));

        //  In Java 8, you can loop a Map with forEach + lambda expression.
        map.forEach((k, p) -> {
            System.out.println(k);
            System.out.println(p.getName());
        });
    }

    public static void sync(){
        Map<String, String> currencies = new HashMap<String, String>();
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");
        currencies.put("Canada", "CAD");
        currencies.put("HongKong", "HKD");
        currencies.put("Australia", "AUD");

        currencies = Collections.synchronizedMap(currencies);

        Set<String> keySet = currencies.keySet();

        synchronized (currencies) {
            Iterator<String> itr = keySet.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

    public static void main(String[] args) {
//        collectionViewsDemo();
//        multipleMapDemo();
//        forEachWithMap1();
//        forEachWithMap2();
        sync();
    }
}
