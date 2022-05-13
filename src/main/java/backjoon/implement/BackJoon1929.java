package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1929 {

    public static boolean isPrime(long l) {
        if(l<2) return false;
        if(l==2) return true;
        boolean result = true;
        for(long i = 2; i <= (long)Math.sqrt(l); i++) {
            if(l%i==0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=m;i<=n;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
