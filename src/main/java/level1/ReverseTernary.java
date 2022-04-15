package level1;

import java.util.Stack;

//3진법 뒤집기
public class ReverseTernary {

    public int solution(int numbers) {

        int division=0;
        int lastvalue=0;
        int answer = 0;

        Stack<Integer> s = new Stack<>();

        while (true){
            division = numbers / 3;
            lastvalue = numbers % 3;

            s.push(lastvalue);
            numbers=division;
            if(division == 0) break;

        }
        int s_len= s.size();

        for(int i=0; i <s_len;i++){
            answer += (int)(s.pop() * Math.pow(3,i));
        }
        return answer;

    }

    public static void main(String[] args) {
        ReverseTernary reverseTernary = new ReverseTernary();
        int n = 45;
        System.out.println(reverseTernary.solution(n));
    }
}
