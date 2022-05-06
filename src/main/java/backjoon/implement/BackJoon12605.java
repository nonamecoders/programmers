package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon12605 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String[] arr = br.readLine().split(" ");
            StringBuffer sb= new StringBuffer();
            sb.append("Case #");
            sb.append((i+1)+": ");
            for(int j=arr.length-1;j>=0;j--){
                sb.append(arr[j]);
                if(j>0) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
