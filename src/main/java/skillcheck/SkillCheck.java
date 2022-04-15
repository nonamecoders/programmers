package skillcheck;

import java.util.Arrays;
import java.util.Collections;

public class SkillCheck {


    public int solution (int[] A, int[] B){

        //배열 정렬, 역정렬
        int answer =0;
        Integer[] arr1 = new Integer[A.length];
        Integer[] arr2 = new Integer[B.length];

        for(int i=0;i<A.length;i++){
            arr1[i] = A[i];
            arr2[i] = B[i];
        }

        Arrays.sort(arr1,Collections.reverseOrder());
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            answer += arr1[i] * arr2[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        SkillCheck skillCheck = new SkillCheck();
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        System.out.println(skillCheck.solution(A,B));
    }
}
