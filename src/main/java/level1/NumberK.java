package level1;

import java.util.ArrayList;
import java.util.Collections;

public class NumberK {
    public int[] solution(int[] array, int[][] commands) {

        int[] sub = {};
        int[] answer= new int [commands.length];

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for(int[] subArray : commands){
            int start = subArray[0]-1;
            int end = subArray[1]-1;
            int pic = subArray[2]-1;

            for(int i=start; i<=end; i++){
                list.add(array[i]);
                Collections.sort(list);
                if(i==end) {
                    answer[index] = list.get(pic);
                    index++;
                }
            }
            list.clear();
        }

        return answer;

    }

    public static void main(String[] args) {
        NumberK numberK = new NumberK();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        for(int i : numberK.solution(array,commands))
            System.out.println(i);
    }
}
