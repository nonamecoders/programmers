package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon9625 {

    static String a = "B";
    static String b = "BA";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a=0;
        int b=1;
        int sum=0;

        for(int i=1;i<n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println(a + " " + b);

    }
}
