package level1;

public class SumBetweenNum {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b)
            return a;

        else {
            if(a>b)
                answer = (((long)a - (long)b+1)* ((long)b + (long)a))/2;
            else
                answer = (((long)b - (long)a+1)* ((long)a + (long)b))/2;
        }

        return answer;
    }

    public static void main(String[] args) {
        SumBetweenNum sumBetweenNum = new SumBetweenNum();
        int a=3,b=5;

        System.out.println(sumBetweenNum.solution(a,b));
    }
}
