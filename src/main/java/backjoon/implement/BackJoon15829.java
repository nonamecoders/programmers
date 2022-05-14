package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon15829 {
    static final int M = 1234567891;

    //https://finger-ineedyourhelp.tistory.com/10
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long sum=0;
        long pow=1;

        char[] s = br.readLine().toCharArray();

        for(int i=0;i<n;i++){
            int num = s[i]-'a'+1;
            sum += num * pow % M;
            pow = pow * 31 % M;
        }

        System.out.println(sum % M);

    }
}
