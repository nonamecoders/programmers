package skillcheck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Scoville {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        //우선순위 큐
        //쌓일때는 들어가는 순서대로 들어가지만
        //peek or poll 할 때는 작은 값으로 꺼냄
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : scoville)
            heap.add(i);

        while (heap.peek()<K){
            int min1= heap.poll();
            int min2= heap.poll();

            heap.add(min1+min2*2);
            answer++;
            if(heap.peek()>=K){
                break;
            }
            if(heap.peek() < K && heap.size()==1){
                answer=-1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scoville scoville = new Scoville();
        int[] scovilles = {1,2,3,9,10,12};
        int K =9;

        System.out.println(scoville.solution(scovilles,K));

    }
}
