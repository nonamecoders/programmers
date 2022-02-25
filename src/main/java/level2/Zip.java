package level2;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Zip {

    public int[] solution(String msg) {
        Map<String,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        char ch = 'A';
        for(int i = 1; i<27;i++){
            map.put(ch +"",i);
            ch +=1;
        }
        int start = 27;

        boolean flag = false;
        for(int i=0; i<msg.length();i++){
            String word = msg.charAt(i)+"";

            while(map.containsKey(word)){
                i++;
                if(i==msg.length()){
                    flag=true;
                    break;
                }
                word += msg.charAt(i);
            }

            if(flag){
                list.add(map.get(word));
                break;
            }
            list.add(map.get(word.substring(0,word.length()-1)));

            map.put(word,start++);
            i--;


        }

        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Zip zip = new Zip();
        String msg = "KAKAO";
        for (int i : zip.solution(msg))
            System.out.println(i);
    }

}
