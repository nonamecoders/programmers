package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackJoon7585 {

    static int solution (String S){
        Stack<Character> stack = new Stack<>();

        for(char c: S.toCharArray()){
            if(c=='(' || c=='{'|| c=='[') stack.push(c);
            else {

                if (c == ')' && stack.pop() != '(') return 0;
                else if (c == ']' && stack.pop() != '[') return 0;
                else if (c == '}' && stack.pop() != '{') return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();

            if(s.equals("#")) break;
            else {
                String answer = solution(s)==1 ? "Legal" : "Illegal";
                System.out.println(answer);
            }
        }
    }
}
