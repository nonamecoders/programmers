package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackJoon9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String answer = "";
            String s = br.readLine();
            stack = new Stack<>();
            for(int j =0;j<s.length();j++){
                if(!stack.isEmpty() && (s.charAt(j)==')'&& stack.peek() == '(')) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(j));
                }
            }
            answer = stack.isEmpty() ? "YES" : "NO";
            System.out.println(answer);
        }
    }
}
