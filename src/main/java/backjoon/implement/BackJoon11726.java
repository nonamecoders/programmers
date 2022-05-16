package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon11726 {

    public static int cycle(int num){
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < num + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }


        return dp[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(cycle(n));
    }
}
