import java.util.*;
import java.util.stream.Stream;

public class StreamCreationExamples {
    public static void main(String[] args) {

//        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "SPRING", "Hibernate");
//        Stream<String> stream2 = collection.stream();
//        stream2.forEach(System.out::println);
//        System.out.println();
//
//        List<String> list = Arrays.asList("JAVA", "J2EE", "SPRING", "Hibernate");
//        Stream<String> stream3 = list.stream();
//        stream3.forEach(System.out::println);
//        System.out.println();
//
//        Set<String> set = new HashSet<>(list);
//        Stream<String> stream4 = set.stream();
//        stream4.forEach(System.out::println);
//        System.out.println();

        Stream<String> streamOfArray = Stream.of("a", "b","c");
        streamOfArray.forEach(System.out::println);
        System.out.println(streamOfArray);

//        String[] arr = new String[] {"a", "b", "c"};
//        Stream<String> streamOfArrayFull = Arrays.stream(arr);
//        streamOfArrayFull.forEach(System.out::println);
//



    }
}
