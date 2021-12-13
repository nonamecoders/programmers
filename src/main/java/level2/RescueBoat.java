package level2;

import java.util.Arrays;

public class RescueBoat {

    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min =0;
        for(int max = people.length-1;min<=max; max--){
            if(people[min] +people[max] <= limit) min ++;
            answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        RescueBoat rescueBoat = new RescueBoat();
        int[] people ={70,50,80,50};
        int limt = 100;
        System.out.println(rescueBoat.solution(people,limt));
    }
}
