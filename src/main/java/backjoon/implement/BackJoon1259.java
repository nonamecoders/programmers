package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num;
        boolean result;
        while(true) {

            result=true;
            num = br.readLine();
            if(num.equals("0")) break;

            int len = num.length();
            char[] arr = num.toCharArray();

            for(int i=0; i<len/2; i++) {
                if(arr[i] != arr[len-1-i]){
                    result=false;
                    break;
                }
            }
            if(result)
                System.out.println("yes");
            else System.out.println("no");

        }

        br.close();
    }
}
