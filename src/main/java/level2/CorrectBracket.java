package level2;

import java.util.Stack;

public class CorrectBracket {

    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) ==')') return false;

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)==')'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        answer = (stack.isEmpty()) ? true : false;

        return answer;

    }

    public static void main(String[] args) {
        CorrectBracket correctBracket = new CorrectBracket();
        String s = "()()";
        System.out.println(correctBracket.solution(s));

    }


}
