package level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";

        //소문자 97~ 122  대문자 65~ 90
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 97 && c<=122 ){
                if(c+n >122){
                    answer+= String.valueOf((char)(c-26 +n)) ;
                } else
                    answer+= String.valueOf((char)(c +n)) ;
            } else if (c >= 65 && c<=90){
                if(c+n >90){
                    answer+= String.valueOf((char)(c-26 +n)) ;
                } else
                    answer+= String.valueOf((char)(c +n)) ;
            } else if (c == 32){
                answer += " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String s = "AB";
        int n =1;
        System.out.println(caesarCipher.solution(s,n));
    }
}
