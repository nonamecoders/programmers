
import java.util.LinkedList;
import java.util.Queue;

public class Cote {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> wait = new LinkedList<>();
        Queue<Integer> onBridge = new LinkedList<>();


        //bridge_length = 다리 길이, 1초에 1씩 갈 수 있음
        //weight = 다리 하중
        //truck_weight = 트럭들 무게

        int time =0;


        //트럭 대기열
        for(int i : truck_weights){
            wait.offer(i);
        }

        //다리 초기상태 세팅
        for(int i=0;i<truck_weights.length;i++){
            onBridge.offer(0);
        }

        int onBridgeWeight=0;

        //트럭 다 통과할 때 까지 !대기열에서 빠져나가도 다리에서 다 빠져나가야함
        while(!onBridge.isEmpty()){
            //다리 비어있고, 다리차 무게 0일 때

            if(onBridge.isEmpty() && onBridgeWeight ==0) {
                time++;
                onBridgeWeight += wait.peek();
                onBridge.offer(wait.poll());

            } else if (!onBridge.isEmpty() && wait.isEmpty()) {
                time += bridge_length;
                onBridge.poll();

                break;
                //다리에 차가 있고, 다리차 무게+ 대기열 차 무게 <= 하중 이면 다리에 넣음
            } else if(!onBridge.isEmpty() && onBridgeWeight + wait.peek() <= weight) {
//                time++;

                onBridgeWeight += wait.peek();
                wait.poll();

            } else if(!onBridge.isEmpty() && onBridgeWeight + wait.peek() > weight){
                onBridgeWeight -= onBridge.peek();
                time += bridge_length;
                onBridge.poll();

            }

//            time += bridge_length;
        }


        return time;
    }


        public static void main(String[] args) {

        Cote cote = new Cote();

        int bridge = 100;
        int weight =10;
        int truck[] = {10,10,10,10,10,10,10,10,10,10};

//            int bridge = 2;
//            int weight =1;
//            int truck[] = {1,1,1,1,1};

        int result = cote.solution(bridge,weight,truck);

            System.out.println(result);
    }
}
