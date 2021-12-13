package level1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Budget {
    public int solution(int[] d, int budget) {
        List<Integer> list = new LinkedList<>();

        int sum=0;

        for (int i : d){
            list.add(i);
        }

        Collections.sort(list);

        for(int i =0; i <list.size(); i++){
            sum += list.get(i);
            System.out.println("sum : " + sum);
            if (sum < budget){
                if(i == list.size()-1)
                    return i+1;
            }
            else if(sum > budget ) {
                return i;
            } else if(sum == budget ) {
                return i+1;
            }

        }

        return 0;
    }

    public static void main(String[] args) {
        Budget b = new Budget();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        System.out.println(b.solution(d,budget));
    }
}
