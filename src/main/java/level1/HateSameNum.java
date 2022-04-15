package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HateSameNum {

    //이전 배열 숫자 중복제거
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i < arr.length; i++){
            if(arr[i-1]!=arr[i]){
                list.add(arr[i]);
            }
        }

//        int[] answer = new int[list.size()];


//        for(int i = 0; i<list.size(); i++ ){
//            answer[i] = list.get(i);
//        }

        int[] answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        HateSameNum hateSameNum = new HateSameNum();
        int[] arr = {1,1,3,0,1,1};
        for(int i : hateSameNum.solution(arr))
            System.out.println(i);
    }
}
