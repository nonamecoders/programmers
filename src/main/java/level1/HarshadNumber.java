package level1;

import java.util.stream.Stream;

public class HarshadNumber {

    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int[] arrNum = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i=0; i<arrNum.length;i++){
            sum +=arrNum[i];
        }
        if(x%sum == 0) answer=true;
        else answer =false;

        return answer;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        int x = 10;
        System.out.println(harshadNumber.solution(x));
    }
}
