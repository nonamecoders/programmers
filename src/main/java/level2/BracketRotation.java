package level2;

import java.util.Stack;

public class BracketRotation {
    public static int correct(String s){

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c) {
                case '(' :
                case '{' :
                case '[' :
                    stack.push(c); break;
                case ')' :
                case '}' :
                case ']' :
                    if(stack.empty()) return 0;
                    else {
                        char openPair = stack.pop();
                        if((openPair == '(' && c !=')') ||
                                (openPair == '{' && c !='}') ||
                                (openPair == '[' && c !=']'))
                            return 0;
                        else break;

                    }
            }
        }
        answer = (stack.isEmpty()) ? 1 : 0;

        return answer;

    }

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();


        String change =s.substring(1,s.length()) + s.substring(0,1);

        int count =0;

        for(int i=0;i <s.length(); i++){
            if(1==0){
                count += correct(s);
            } else{
                String start =change.substring(0,1);
                String end = change.substring(1,s.length());
                change = end +start;
                count += correct(change);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        BracketRotation bracketRotation = new BracketRotation();
        String s = "[](){}";
        System.out.println(bracketRotation.solution(s));
    }
}
