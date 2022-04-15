package kakaoBlind2022;

import java.util.Arrays;

public class KnaryPrimeNumber {

//    public boolean isPrime(long l) {
//        if(l==0 || l==1) return false;
//        if(l==2 || l==3) return true;
//        boolean result = true;
//        for(long i = 3; i < (long)Math.sqrt(l); i++) {
//            if(l%i==0) {
//                result = false;
//                break;
//            }
//        }
//
//        return result;
//    }
//
//    public String convert(int n, int k){
//        StringBuffer sb= new StringBuffer();
//        while(n>0){
//            sb.append(n%k);
//            n/=k;
//        }
//
//        return sb.reverse().toString();
//    }
//
//    public int solution(int n, int k) {
//        int answer = 0;
//        String[] arr = convert(n, k).split("0+");
//
//        for (String s : arr) {
//            long l = Long.parseLong(s);
//            if(isPrime(l))
//                answer++;
//        }
//
//        return answer;
//    }

    public int solution(int n, int k) {

        int ans = 0;
        String temp[] = Integer.toString(n, k).split("0");

        Loop : for(String t : temp) {
            if(t.length() == 0) continue;
            long a = Long.parseLong(t);
            if(a == 1) continue;
            for(int i=2; i<=Math.sqrt(a); i++)
                if(a%i == 0) continue Loop;

            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 110011;
        int k = 10;
        KnaryPrimeNumber knaryPrimeNumber = new KnaryPrimeNumber();
        System.out.println(knaryPrimeNumber.solution(n,k));
    }

}
