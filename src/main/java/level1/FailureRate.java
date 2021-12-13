package level1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        Map<Integer,Float> map = new HashMap<>();

        int failer =0;
        int stage_level =1;
        int user = stages.length;

        int answer [] = new int [N];

        while(stage_level <= N) {

            for(int i=0;i<stages.length;i++){
                if(stages[i] == stage_level){
                    failer ++;
                }

            }
            if(user==0){
                map.put(stage_level,0f);
            } else{
                map.put(stage_level,(float) failer/user);
                user -=failer;
            }

            failer =0;
            stage_level ++;
        }

        List<Map.Entry<Integer, Float>> entries = entries = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        int i =0;
        for (Map.Entry<Integer, Float> entry : entries) {
            answer[i] = entry.getKey();
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        FailureRate failureRate = new FailureRate();
        int N = 5;
        int[] states = {2,1,2,6,2,4,3,3};
        for(int i : failureRate.solution(N,states))
            System.out.println(i);

    }
}
