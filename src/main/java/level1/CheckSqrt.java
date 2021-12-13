package level1;

public class CheckSqrt {

    public long solution(long n) {
        long answer = 0;

        double sqrt = 0;

        sqrt = Math.sqrt(n);

        if(sqrt * 10 % 10 !=0 )
            answer = -1;
        else
            answer = (long) (sqrt+1) * (long) (sqrt+1);

        return answer;
    }

    public static void main(String[] args) {
        CheckSqrt checkSqrt = new CheckSqrt();
        long n = 121;
        System.out.println(checkSqrt.solution(n));
    }

}
