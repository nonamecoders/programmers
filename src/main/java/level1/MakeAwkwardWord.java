package level1;

public class MakeAwkwardWord {

    public String solution(String s) {
        String answer = "";
        int cnt =0;
        String[] arr = s.split("");
        for(String ss : arr){
            cnt = ss.contains(" ") ? 0 : cnt+1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeAwkwardWord makeAwkwardWord = new MakeAwkwardWord();
        String s = "try hello";
        makeAwkwardWord.solution(s);
    }
}
