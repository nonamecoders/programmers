package level1;

public class DivisorTotalSum {

    public static int getDiv(int num){
        int i=1;
        int count =0;
        for(i=1; i<=num;i++){
            if(num%i==0)
                count ++;
        }

        return count;
    }

    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left;i<=right;i++){
            int count = getDiv(i);

            if(count%2==0) { //짝수일때
                answer +=i;
            }else {
                answer -=i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        DivisorTotalSum divisorTotalSum = new DivisorTotalSum();
        int left= 13;
        int right = 17;
        System.out.println(divisorTotalSum.solution(left,right));
    }

}
