package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon14659 {

    public static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int [n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){

            arr[i]= Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j <n; j++) {
                if (arr[i] > arr[j]) count++;
                else break;
            }
            answer = answer > count ?answer : count;
        }
        System.out.println(answer);
    }
}
