package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10162 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int a =0;
        int b =0;
        int c =0;
        if(t/300 > 0){
            a = t/300;
            t -= 300*a;
        }

        if(t/60 > 0){
            b = t/60;
            t -= 60*b;
        }
        if(t%10 > 0) {
            System.out.println(-1);
        } else if(t/10 >= 0){
            c = t/10;
            System.out.println(a + " " + b + " " + c);
        }
    }
}

