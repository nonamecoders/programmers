package backjoon.function.recursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelfNumber {

    public int solution(int n) {

        if(n<=1){
            return 1;
        }

        return n * (solution(n-1));
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        SelfNumber selfNumber = new SelfNumber();
        int result = selfNumber.solution(n);

        System.out.println(result);


    }
}
