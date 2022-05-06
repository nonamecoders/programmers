package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackJoon17608 {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int base =0;
        for(int i=0; i<n; i++) {
            int bar = Integer.parseInt(br.readLine());
            if(i<n-1) {
                stack.push(bar);
            } else if(i == n-1){
                base=bar;
            }
        }

        int count = 1;
        while(!stack.isEmpty()) {
            int pop = stack.pop();
            if(pop > base) {
                base = pop;
                count++;
            }
        }

        System.out.println(count);
    }
}
