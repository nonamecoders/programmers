package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1009 {

    public void solution () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = 1;

            for(int j=0;j<b;j++){
                result = a * result % 10;
                if(result==0)
                    result=10;
            }
            System.out.println(result);
        }
    }

    // 분산처리 https://www.acmicpc.net/problem/1009
    public static void main(String[] args) throws IOException {

        BackJoon1009 backJoon1009 = new BackJoon1009();
        backJoon1009.solution();

    }
}
