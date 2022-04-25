package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2748 {

    public long fibo(int n) {
        long[] array = new long [n+1];

        array[0] =0;
        array[1] =1;

        if(n > 1){
            for(int i=2;i<=n;i++){
                array[i] = array[i-2] + array[i-1];
            }
        }
        return array[n];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BackJoon2748 main = new BackJoon2748();
        System.out.println(main.fibo(n));

    }
}
