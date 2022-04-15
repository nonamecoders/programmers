package level2;


import java.util.Stack;

public class RemovePair {

    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack.empty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        RemovePair removePair = new RemovePair();

        String s = "baabaa";
        System.out.println(removePair.solution(s));
    }

}
