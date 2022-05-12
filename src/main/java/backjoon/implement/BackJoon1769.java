package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1769 {

    static int count;

    static void cycle (String s){
        if(s.length()==1) {
            System.out.println(count);
            if(Integer.parseInt(s) % 3 > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            return;
        }

        int n =0;
        count++;
        for(int i=0;i<s.length();i++){
            n += s.charAt(i)-48;

        }
        cycle(String.valueOf(n));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //연산 개수
        String num = br.readLine();

        cycle(num);

    }
}
