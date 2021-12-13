package level1;

public class SumMeasure {
    public int solution(int n) {
        int answer = 0;

        if(n==0){
            return 0;
        }

        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer+=i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SumMeasure sumMeasure = new SumMeasure();
        int n =12;
        System.out.println(sumMeasure.solution(n));
    }
}
