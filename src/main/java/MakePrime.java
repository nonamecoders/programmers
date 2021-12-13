public class MakePrime {

    public boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i =2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public int solution(int[] nums) {
        int answer = -1;

        //각 숫자 조합 3자리

        // 소수인지 아닌지 카운팅

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        MakePrime makePrime = new MakePrime();
        int result = makePrime.solution(nums);

        System.out.println(result);
    }
}
