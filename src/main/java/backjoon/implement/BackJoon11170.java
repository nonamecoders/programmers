package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon11170 {

    public static int cycle(int num){

        int count=0;
        if(num == 0) return 1;
        while(true){
            if(num > 0){
                if(num%10 == 0){
                    count ++;
                }
                num/=10;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int count =0;
            for(int j=n;j<=m;j++){
                count += cycle(j);
            }
            System.out.println(count);
        }
    }
}
