package kakaoBlind2022;

public class Achery {

    public int[] solution(int n, int[] info) {
        int[] answer = {-1};
        int point = 10;
        int apeachPoint = 0;
        int ryanPoint = 0;

        int apeachTime = 0;
        int ryanTime = 0;
        int[] ryan =new int[10];

        for(int i=0; i< info.length; i++){
            apeachTime += info[i];
            int apeachTarget = info[i];
            int ryanTarget = 0;

            point--;
            if(apeachTime==n)
                break;
        }



        return answer;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] info = {2,1,1,1,0,0,0,0,0,0,0};

        Achery achery = new Achery();
        int[] result = achery.solution(n,info);

        for (int i : result) {
            System.out.println(i);
        }

    }
}
