import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurrenceOfCharInString {

    public static void main(String[] args) {

        int count = countMatches("javaguides", 'a');

        System.out.println("using for loop : " + count);
        System.out.println("using java 8 streams and lamdas : " + countOccurrencesOf("javaguides", 'a'));
        System.out.println("using regular expressions : " + countCharsUsingReg("javaguides", 'a'));

    }

    public static int countMatches(String str, char ch){

        if(str == null || str.length() == 0){
            return 0;
        }

        int count = 0;

        for(int i=0; i<str.length(); i++){
            if (ch == str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static long countOccurrencesOf(String str, char character){
        return str.codePoints().filter(ch-> ch == character).count();
    }

    public static long countCharsUsingReg(String str, char character){

        Pattern pattern = Pattern.compile("[^" + character + "]*" + character + "");
        Matcher matcher = pattern.matcher(str);

        int count=0;

        while (matcher.find()){
            count++;
        }

        return count;

    }





}
