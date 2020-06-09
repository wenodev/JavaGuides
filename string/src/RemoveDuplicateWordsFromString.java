import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromString {

    public static void main(String[] args) {

        String string = "i like java java coding java and you do you interested in java coding coding.";

        String[] strArray = string.split("\\s+");

        Set<String> strSet = new LinkedHashSet<>(Arrays.asList(strArray));
        System.out.println("strSet : " + strSet);


        StringBuilder builder = new StringBuilder();
        int index = 0;

        for(String s : strSet){

            if(index > 0)
                builder.append(" ");
            builder.append(s);
            index++;
        }

        System.out.println("builder : " + builder);
        string = builder.toString();
        System.out.println("str : " + string);



    }


}
