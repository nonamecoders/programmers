package tranbe;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public String solution(String s){
        String answer = "";

        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        Map<String,Integer> map = new HashMap<>();

        for(char c: arr){
            String s1 = c+"";
            map.put(s1,map.getOrDefault(s1,0) +1);
        }

        System.out.println(map);

        Integer maxValue = Collections.max(map.values());

        System.out.println(maxValue);

        for(String key : map.keySet()){
            Integer value = map.get(key);
            if(value == maxValue) {
                answer +=key;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        System.out.println(test1.solution("bBaCaBCBAA")); //a
    }
}
