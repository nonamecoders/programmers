package level2;

import java.util.LinkedList;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown+ yellow;

        LinkedList<Integer> list= new LinkedList<>();
        for(int i=yellow; i>=1;i--){
            if(yellow%i==0){
                list.add(i);
            }
        }

        int a =0;
        int b =0;
        int size = list.size();
        for(int i=0;i<size;i++){

            int yellow_x = list.get(i);
            int yellow_y = list.get((size-1)-i);

            if (total == (yellow_x+2) * (yellow_y+2)){
                a = yellow_x +2;
                b = yellow_y +2;
                break;
            }
        }

        answer[0] = a;
        answer[1] = b;


        return answer;
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        int brown = 10;
        int yellow = 2;
        for(int i : carpet.solution(brown,yellow))
            System.out.println(i);
    }
}
