package level1;

public class SelectMiddleWord {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2 != 0){
            answer = String.valueOf(s.charAt(s.length()/2));
        }else {
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        SelectMiddleWord selectMiddleWord = new SelectMiddleWord();
        String s = "abcde";
        System.out.println(selectMiddleWord.solution(s));
    }
}
