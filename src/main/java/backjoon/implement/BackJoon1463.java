package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1463 {

    public static int cycle(int n){
        int [] dp = new int[n+1];

        for(int i=2;i<n+1;i++){
            dp[i] = dp[i-1] +1;
            if(i%2 == 0) {
                dp[i] = Math.min(dp[i],dp[i/2] + 1);
            }
            if(i%3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(cycle(n));

    }

}
