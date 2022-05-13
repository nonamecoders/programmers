package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackJoon10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum =0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(num);
            }
        }

        for(int num : stack){
            sum+=num;
        }

        System.out.println(sum);
    }
}
