import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args) {


        // git test 0608
        Map<String, String> map = new HashMap<>();
        map.put("one", "one-one");
        map.put("two", "two-two");
        map.put("three", "three-three");
        map.put("two", "two-two");

        System.out.println(map);

        for(Map.Entry<String, String> entry : map.entrySet()){
            if(entry.getKey() == "two"){
                System.out.println("if");
            }else{
                System.out.println("else");
            }
        }

    }

}
