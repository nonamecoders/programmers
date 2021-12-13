public class LottoRating {
    public static int rank(int number){

        int rank=6;
        switch (number) {
            case 6 : rank =1;
                break;
            case 5 : rank =2;
                break;
            case 4 : rank =3;
                break;
            case 3 : rank =4;
                break;
            case 2 : rank =5;
                break;
            default:
                break;

        }

        return rank;
    }

    public int[] solution (int[] lottos, int[] win_nums) {

        int[] answer = new int[2];

        int count=0;
        int zero=0;

        for(int i =0; i<lottos.length; i++){
            if(lottos[i] == 0)
                zero++;
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j])
                    count ++;

            }
        }

        answer[0] = rank(count+zero);
        answer[1] = rank(count);

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        LottoRating lottoRating = new LottoRating();

        int[] result = lottoRating.solution(lottos,win_nums);

        for(int i : result)
            System.out.println(i);
    }
}
