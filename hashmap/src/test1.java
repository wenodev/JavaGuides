import java.util.HashMap;
import java.util.Map;

public class test1 {
    public static void main(String[] args) {

        Map<String, String> userCityMapping = new HashMap<>();
        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        String userName = "Steve";
        if(userCityMapping.containsKey(userName)){
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        }else{
            System.out.println("City details not found for user " + userName);
        }
        
    }

}
