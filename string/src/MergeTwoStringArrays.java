import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoStringArrays {

    public static String[] mergeStringArrays(String array1[], String array2[]) {

        if (array1 == null || array1.length == 0)
            return array2;
        if (array2 == null || array2.length == 0)
            return array1;

        List<String> firstList = Arrays.asList(array1);
        List<String> secondList = Arrays.asList(array2);

        List<String> result = new ArrayList<>(firstList);
        List<String> tmp = new ArrayList<>(firstList);

        tmp.retainAll(secondList);
        System.out.println("tmp : " + tmp);
        result.removeAll(tmp);
        System.out.println("result : " + result);
        result.addAll(secondList);
        System.out.println("result : " + result);

        System.out.println("result.size : " + result.size());

        System.out.println("new String[result.size()] : " + new String[result.size()]);

        System.out.println( "return : " + (String[]) result.toArray(new String[result.size()]));

        return ((String[]) result.toArray(new String[result.size()]));

    }

    public static void main(String[] args) {
        String[] strArray = mergeStringArrays(new String[]{
                        "abc",
                        "xyz",
                        "pqr"
                },
                new String[]{
                        "abc",
                        "ABC",
                        "PQR"
                });
        for (String str : strArray){
            System.out.println(str);
        }
    }

}
