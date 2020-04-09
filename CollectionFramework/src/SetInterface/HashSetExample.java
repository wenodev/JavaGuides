package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        //Creating a HashSet
        Set<String> daysOfWeek = new HashSet<>();

        //Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println("=======");
        System.out.println(daysOfWeek);

        daysOfWeek.add("Monday");

        System.out.println("=======");
        System.out.println(daysOfWeek);

    }
    
}
