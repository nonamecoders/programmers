package backjoon.function.recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fifo {

    public int fifo(int n){

        if(n == 0){
            return 0;
        }

        if(n <= 2)
            return 1;
        return fifo(n-1) + fifo(n-2);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Fifo fifo = new Fifo();
        int result = fifo.fifo(n);

        System.out.println(result);


    }

}
