package level1;

public class MakePrime {
    static int count =0;
    static int[] choice3 = new int [3];

    public void comb(int cnt,int start,int[] nums){
        if(cnt==3){
            int sum=0;

            for(int i : choice3)
                sum+=i;

            if(isPrime(sum)){
                count++;
            }


            return;
        }

        for(int i=start;i<nums.length;i++){
            choice3[cnt] = nums[i];
            comb(cnt+1,i+1,nums);
        }

    }

    public int solution(int[] nums) {

        comb(0,0,nums);

        return count;
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

    public static void main(String[] args) {
        MakePrime makePrime = new MakePrime();
        int[] nums = {1,2,3,4};
        System.out.println(makePrime.solution(nums));
    }
}
