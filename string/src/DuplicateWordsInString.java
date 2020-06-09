import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

    public static void duplicateWords(String inputString){

        String[] arrayString = inputString.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : arrayString){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            }else{
                wordCount.put(word, 1);
            }
        }


        //Map에서 Key값만 추출하여 Set으로 변경
        Set<String> wordsInString = wordCount.keySet();

        for(String word : wordsInString){

            if(wordCount.get(word) > 1){
                System.out.println(word + " : " + wordCount.get(word));
            }

        }



    }

    public static void main(String[] args) {
        duplicateWords("Java guides java");

        duplicateWords("Java is java again java");

        duplicateWords("Super Man Bat Man Spider Man");

    }

}
