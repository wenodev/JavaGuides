package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] completion = new String[] {"leo", "kiki" };
        solution(participant, completion);


    }

    public static String solution(String[] participant, String[] completion){

        AtomicReference<String> answer = new AtomicReference<>(new String());

        Map<String, Integer> checkMember = new HashMap<>();


        for(String str : participant){
            if(checkMember.containsKey(str)){
                checkMember.put(str,checkMember.get(str) + 1);
            }else{
                checkMember.put(str, 1);
            }
        }

        for (String str : completion){
            checkMember.put(str, checkMember.get(str) - 1);
        }

        for(String key : checkMember.keySet()){
            Integer value = checkMember.get(key);
            System.out.println(key+" : "+value);
        }

        checkMember.forEach((k,v)->{
            if(v == 1){
                answer.set(k);
            }
        });
        System.out.println(answer.get());
        return answer.get();
    }

}


