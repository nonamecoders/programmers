package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevFunc {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> success = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain);

            if (!success.isEmpty() && success.peek() < date) {
                answerList.add(success.size());
                success.clear();
            }

            success.offer(date);
        }

        answerList.add(success.size());

        return answerList.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        DevFunc devFunc = new DevFunc();

        int[] progresses = {93,30,55};
        int[] speed = {1,30,5};

        for(int i : devFunc.solution(progresses,speed))
            System.out.println(i);

    }


}
