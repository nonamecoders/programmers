package level1;

public class IncreaseX {

    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        int idx = 0;
        while (idx < n){
            answer[idx] = x + (x*idx);
            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        IncreaseX increaseX = new IncreaseX();
        long x = 2;
        int n = 5;

        System.out.println(increaseX.solution(x,n));
    }

}
