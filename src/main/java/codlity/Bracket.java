package codlity;

import java.util.Stack;

public class Bracket {

    public int solution (String S){
        Stack<Character> stack = new Stack<>();
        char lastChar;

        for(char c: S.toCharArray()){
            if(c=='(' || c=='{'|| c=='[') stack.push(c);
            else {
                if(stack.empty()) return 0;
                lastChar =stack.pop();

                if (c == ')' && lastChar != '(') return 0;
                else if (c == ']' && lastChar != '[') return 0;
                else if (c == '}' && lastChar != '{') return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;

    }

    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        System.out.println(bracket.solution("([)()]"));
    }
}
