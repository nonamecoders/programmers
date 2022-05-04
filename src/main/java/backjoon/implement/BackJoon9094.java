package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon9094 {

    public static int cycle (int n,int m){
        int count =0;
        for(int a =1;a<n;a++){
            for(int b=a+1;b<n;b++){
                if((a*a + b*b + m) % (a*b)==0)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String[] arr = br.readLine().split(" ");
            int n =Integer.parseInt(arr[0]);
            int m =Integer.parseInt(arr[1]);

            System.out.println(cycle(n,m));
        }

    }
}
