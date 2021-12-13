package level1;

public class FindPrimeUntilNum {

    public int prime(int n){

        int count=0;
        boolean[] prime = new boolean[n+1];

        for(int i=2; i<=n;i++){
            prime[i] = true;
        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(prime[i]== true){
                for(int j=i;i*j<=n;j++)
                    prime[i*j]=false;
            }
        }

        for(int i=2; i<=n;i++){
            if(prime[i] ==true) count++;
        }
        return count;
    }


    public int solution(int n) {


        return prime(n);
    }

    public static void main(String[] args) {
        FindPrimeUntilNum findPrimeUntilNum = new FindPrimeUntilNum();
        int n = 10;
        System.out.println(findPrimeUntilNum.solution(n));
    }
}
