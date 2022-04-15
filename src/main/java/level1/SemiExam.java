package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SemiExam {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        //맞은 개수
        int man1_cnt = 0;
        int man2_cnt = 0;
        int man3_cnt = 0;

        int[][] supoja = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        for(int i = 0; i < answers.length; i++) {
            //첫번째 수포자
            man1_cnt = answers[i] == supoja[0][i % 5] ? man1_cnt + 1 : man1_cnt;
            //두번째 수포자
            man2_cnt = answers[i] == supoja[1][i % 8] ? man2_cnt + 1 : man2_cnt;
            //세번째 수포자
            man3_cnt = answers[i] == supoja[2][i % 10] ? man3_cnt + 1 : man3_cnt;
        }

        int[] maxFinder = new int[3];
        maxFinder[0] = man1_cnt;
        maxFinder[1] = man2_cnt;
        maxFinder[2] = man3_cnt;

        int max = 0;
        for(int cnt : maxFinder) {
            max = max < cnt ? cnt : max;
        }

        for(int i = 0; i < 3; i++) {
            if(max == maxFinder[i]) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        SemiExam semiExam = new SemiExam();
        int[] answers = {1,2,3,4,5};
        for(int i : semiExam.solution(answers)){
            System.out.println(i);
        }
    }
}
