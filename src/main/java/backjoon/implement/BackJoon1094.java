package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1094 {

    public void solution (int x) {

        String bi = Integer.toBinaryString(x);

        int count = 0;

        for(char c : bi.toCharArray()){
            if(c=='1') count ++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x= Integer.parseInt(st.nextToken());

        BackJoon1094 main = new BackJoon1094();
        main.solution(x);

    }
}
