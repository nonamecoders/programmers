package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class BackJoon4949 {

    public static int cycle(char[] arr){
        Stack<Character> stack = new Stack<>();

        try {
            for (char c : arr) {
                if (c == '(' || c == '{' || c == '[') stack.push(c);
                else {

                    if (c == ')' && stack.pop() != '(') return 0;
                    else if (c == ']' && stack.pop() != '[') return 0;
                    else if (c == '}' && stack.pop() != '{') return 0;
                }
            }
        } catch (EmptyStackException ese){
            return 0;
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            String s = br.readLine();
            if(s.equals(".")){
                break;
            } else {
                char cArr [] = s.toCharArray();
                String answer = cycle(cArr) == 1 ? "yes" : "no";
                System.out.println(answer);
            }
        }
    }
}
