package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackJoon10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            String input = br.readLine();
            if(input.startsWith("push")) {
                String[] arr = input.split(" ");
                stack.push(arr[1]);

            } else if (input.equals("top")){
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peek());

            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("pop")){
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pop());
            } else if (input.equals("empty")){
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}
