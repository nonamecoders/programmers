package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompletDivide {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }

        }
        Collections.sort(list);

        if (list.size() > 0) {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else
            return answer;

        return answer;
    }

    public static void main(String[] args) {
        CompletDivide completDivide = new CompletDivide();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        for(int i : completDivide.solution(arr,divisor))
            System.out.println(i);
    }
}
