package level2;

public class WordOf124 {
    public String solution(int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        while(n > 0){
            int rest = n % 3;
            n /= 3;
            if(rest == 0){
                rest = 4;
                n -= 1;
            }
            sb.insert(0,rest);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        WordOf124 wordOf124= new WordOf124();
        int n = 1;
        System.out.println(wordOf124.solution(n));
    }
}
