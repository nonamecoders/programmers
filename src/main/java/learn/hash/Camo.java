package learn.hash;

import java.util.HashMap;
import java.util.Iterator;

public class Camo {

    public int solution(String[][] clothes) {

        int answer =1;
        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0;i<clothes.length;i++){
            hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1],0)+1);
        }

        System.out.println(hm);

        Iterator<String> keys = hm.keySet().iterator();

        while(keys.hasNext()){
            String key = keys.next();
            answer *= hm.get(key)+1;
        }

        answer--;

        return answer;

    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "face"}, {"bluesunglasses", "face"}, {"green_turban", "face"}};

        Camo camo = new Camo();
        System.out.println(camo.solution(clothes));
    }
}
