package tranbe;

import java.util.*;

public class Test3 {

    public int[] solution(int[] grade) {
        int[] answer = new int[grade.length];

        HashMap<Integer, List<Integer>> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<grade.length;i++){
            if(!map.isEmpty() && map.containsKey(grade[i])){
                list = map.get(grade[i]);
            } else {
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(grade[i],list);
        }

        System.out.println(map);
        Iterator<Integer> iter = map.keySet().iterator();

        int count =1;
        while(iter.hasNext()){
            int key = iter.next();
            System.out.println("get Value : " + map.get(key));
            int[] arr = map.get(key).stream().mapToInt(i->i).toArray();
            for(int i :arr){
                answer[i] = count;
            }
            count +=arr.length;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        int[] grade ={1,1,1,1,2};
        for(int i : test3.solution(grade))
            System.out.println(i);
    }
}
