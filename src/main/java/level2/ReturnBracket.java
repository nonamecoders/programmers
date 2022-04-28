package level2;

import java.util.Stack;

public class ReturnBracket {

    static String returnBracket;

    public void cycle(String p){
        if(p.length()==0){

        }
        Stack<Character> stack = new Stack<>();
        String currect = "";
        String balance ="";


        for(int i=0;i<p.length();i++){
            if(!stack.isEmpty() && p.charAt(i)==')'){
                currect = stack.pop()+"" + p.charAt(i);
                if(!stack.isEmpty()){
                    while(stack.empty()){
                        balance = stack.pop()+"";
                    }
                }
            } else {
                stack.push(p.charAt(i));
            }
            balance += p.charAt(i);
        }

        cycle(p);

    }

    public boolean currectBracket(String s){

        if(s.charAt(0) ==')') return false;

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i)==')'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty() ? true : false;
    }

    public String solution(String p) {
        String answer = "";
        String v = "";//올바른
        StringBuffer u = new StringBuffer();//올바른

        if(p.length()==0){
            return "";
        }

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<p.length();i++) {
            if(!stack.isEmpty() && ( stack.peek()=='(' && p.charAt(i)==')')) {
                System.out.println("#####################");
                System.out.println(i);
                //올바른 괄호 떴을때
                v = stack.pop() +"" + p.charAt(i);

                //균형잡힌 괄호 만들기
                //1. 스택 모두 뽑기
                //2. 남은 문자열 세팅
                while(!stack.isEmpty()){
                    u.append(stack.pop());
                }
                u.reverse();
                p.substring(i+1);
                u.append(p.substring(i+1));
                System.out.println("#####################");
                break;
            } else {
                System.out.println("스택 쌓음");
                stack.push(p.charAt(i));
                System.out.println(stack);
            }
        }
        // v : () u : ))((()
        System.out.println("올바른 v : " + v);
        System.out.println("균형잡힌 u : " + u);
        System.out.println("stack() : " + stack);

        //     v :  ()   u :  ))(()(

//        cycle(p);
        return answer;
    }

    public static void main(String[] args) {
        String p = ")(";
        // v : () u : ))))((()

        ReturnBracket returnBracket = new ReturnBracket();
        returnBracket.solution(p);
    }
}
