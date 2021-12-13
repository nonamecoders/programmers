package level2;

import java.util.Stack;

public class MakeBigNumber {
    public String solution(String number, int k) {
        String answer = "";
        char[] result = new char[number.length()-k];
        Stack<Character> stack = new Stack<>();

//        number = 1924
//        k  = 2
        for(int i=0;i<number.length();i++){
            char c = number.charAt(i);
            while(!stack.isEmpty() && stack.peek()<c && k-->0){
                stack.pop();
            }
            stack.push(c);
        }

        for(int i=0; i<result.length;i++){
            result[i] = stack.get(i);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        MakeBigNumber makeBigNumber = new MakeBigNumber();
        String number = "1924";
        int k =2;
        System.out.println(makeBigNumber.solution(number,k));
    }
}
