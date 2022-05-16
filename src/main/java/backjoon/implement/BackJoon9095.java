package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon9095 {

    public static int cycle(int num){
        int[] dp = new int[12];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4;i<num+1;i++){
            dp[i] = dp[i-1] + dp[i-2]+dp[i-3];
        }

        return dp[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            System.out.println(cycle(Integer.parseInt(br.readLine())));
        }

    }
}
