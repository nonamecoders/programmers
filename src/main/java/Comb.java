import java.util.Arrays;

public class Comb {

    /*
    *  배열의 세개의 숫자의 합이 소수일 때 카운트
    * */
    static int count =0;
    //선택 개수 설정 배열
    static int[] choice3 = new int [3];

    public void comb(int cnt,int start,int[] nums){

        if(cnt==3){
            int sum=0;
            System.out.println(Arrays.toString(choice3));
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

        int[] nums ={1,2,3,4};
        Comb comb = new Comb();
        int result = comb.solution(nums);

        System.out.println(result);
    }
}
