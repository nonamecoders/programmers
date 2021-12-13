package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class SumChoice2 {

    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();

        int[] answer = {};
        for( int i=0; i< numbers.length; i++){

            for( int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if ( arr.indexOf(sum) < 0){
                    arr.add(sum);
                }
            }
        }

        answer = new int[arr.size()];

        for( int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        SumChoice2 sumChoice2 = new SumChoice2();
        int[] numbers = {2,1,3,4,1};
        for(int i : sumChoice2.solution(numbers))
            System.out.println(i);
    }
}
