package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1003 {
    static Integer[][] dp = new Integer[41][2];

    static Integer[] cycle(int num) {

        if(dp[num][0] == null || dp[num][1] == null) {
            dp[num][0] = cycle(num - 1)[0] + cycle(num - 2)[0];
            dp[num][1] = cycle(num - 1)[1] + cycle(num - 2)[1];
        }

        return dp[num];

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<t;i++){
            int num = Integer.parseInt(br.readLine());
            cycle(num);
            sb.append(dp[num][0] + " " + dp[num][1]).append("\n");
        }
        System.out.println(sb);

    }
}
