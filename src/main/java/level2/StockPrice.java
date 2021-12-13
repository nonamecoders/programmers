package level2;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {

    public int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();

        int count =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<=prices[j]){
                    count++;
                } else{
                    count++;
                    break;
                }
            }
            list.add(count);
            count =0;
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        int[] prices = {1,2,3,2,3};
        for(int i : stockPrice.solution(prices))
            System.out.println(i);
    }
}
