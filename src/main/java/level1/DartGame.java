package level1;

public class DartGame {

    public int solution(String dartResult) {

        int[] score = new int [3];
        int cnt = -1;

        for(int i=0;i<dartResult.length();i++){
            // 숫자 체크
            if(dartResult.charAt(i) >='0' && dartResult.charAt(i) <='9' ){
                cnt++;
                if(dartResult.charAt(i) =='1' && dartResult.charAt(i+1) =='0'){
                    score[cnt] = 10;
                    i++;
                } else {
                    score[cnt] = dartResult.charAt(i) -'0';
                }
            } else if (dartResult.charAt(i)=='D'){
                score[cnt] *=score[cnt];
            } else if(dartResult.charAt(i)=='T'){
                score[cnt] *= score[cnt] * score[cnt];
            } else if(dartResult.charAt(i) =='*'){
                if(cnt>0){
                    score[cnt-1] *=2;
                }
                score[cnt] *=2;
            } else if (dartResult.charAt(i) =='#'){
                score[cnt] *=-1;
            }
        }

        return score[0] + score[1] + score[2];
    }

    public static void main(String[] args) {
        String dartResult = "1S2D*3T";

        DartGame dartGame = new DartGame();
        System.out.println(dartGame.solution(dartResult));
    }
}
