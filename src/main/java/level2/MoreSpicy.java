package level2;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int i=0; i<scoville.length; i++) {
            heap.add(scoville[i]);
        }

        while (heap.peek() < K) {
            int min1 = heap.poll();
            int min2 = heap.poll();

            heap.add(min1 + min2*2);
            answer++;

            if (heap.peek() >= K) {
                break;
            }
            if (heap.peek() < K && heap.size() == 1) {
                answer = -1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MoreSpicy moreSpicy = new MoreSpicy();
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;
        System.out.println(moreSpicy.solution(scoville,k));
    }


}
