package level1;

public class SumDigit {

    public int solution(int n) {
        int answer = 0;
        String s= String.valueOf(n);

        for(int i=0; i<s.length();i++){
            int num =  Integer.parseInt(String.valueOf(s.charAt(i))) ;
            answer += num;
        }

        return answer;
    }

    public static void main(String[] args) {
        SumDigit sumDigit = new SumDigit();
        int n = 123;
        System.out.println(sumDigit.solution(n));
    }
}
