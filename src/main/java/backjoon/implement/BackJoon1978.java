package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1978 {

    static int count=0;
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
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) {
            if(isPrime(Integer.parseInt(st.nextToken())))
                count++;
        }
        System.out.println(count);

    }
}
