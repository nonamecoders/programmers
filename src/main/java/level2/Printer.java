package level2;

import level1.PrintDay;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : priorities)
            queue.offer(i);

        loopout:
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length;i++){
                if(priorities[i] == queue.peek()){
                    if(i==location){
                        answer++;
                        break loopout;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] priorities ={2,1,3,2};
        int location =2;
        System.out.println(printer.solution(priorities,2));
    }
}
