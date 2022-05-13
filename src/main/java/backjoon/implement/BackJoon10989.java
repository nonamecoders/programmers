package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int [10001];
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine())] ++;
        }
        br.close();
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<arr.length;i++){
            while(arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}