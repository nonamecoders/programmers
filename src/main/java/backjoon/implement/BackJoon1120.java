package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1120 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] wordList = br.readLine().split(" ");

        String a = wordList[0];
        String b = wordList[1];

        int len = b.length()- a.length();

        int count = a.length();

        for(int i=0;i<len+1;i++){
            int diff = 0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j) != b.charAt(j+i)){
                    diff++;
                }
            }
            count = Math.min(count,diff);
        }
        System.out.println(count);
    }
}
