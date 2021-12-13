package level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();


        //getOrDefault : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.
        //종류별 갯수 map 에 입력
        for(int i=0;i<clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0) +1);
        }

        System.out.println(map);
        int count =1;

        if(map.size()>1){
            for(String key : map.keySet()){
                count *= map.get(key)+1;
            }
            count --;
        } else count = clothes.length;

        return count;
    }

    public static void main(String[] args) {
        Camouflage camouflage = new Camouflage();
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(camouflage.solution(clothes));

    }

}
