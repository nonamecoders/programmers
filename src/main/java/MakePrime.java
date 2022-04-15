public class MakePrime {

    static int count =0;
    static int[] choice3 = new int [3];

    public void comb(int cnt,int start,int[] nums){

        if(cnt==3){
            int sum=0;
            for(int i: choice3)
                sum += i;

            if(isPrime(sum)){
                count++;
            }
            return;
        }

        for(int i= start;i<nums.length;i++){
            choice3[cnt] = nums[i];
            comb(cnt+1,i+1,nums);
        }
    }

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

        //각 숫자 조합 3자리
        comb(0,0,nums);
        // 소수인지 아닌지 카운팅

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        MakePrime makePrime = new MakePrime();
        int result = makePrime.solution(nums);

        System.out.println(result);
    }
}
