package level1;

import java.util.HashSet;
import java.util.Set;

public class Pocketmon {
    public int solution(int[] nums) {
        int pic = nums.length/2;

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        if(set.size()>pic)
            return pic;
        else
            return set.size();
    }

    public static void main(String[] args) {
        Pocketmon pocketmon = new Pocketmon();
        int[] nums = {3,1,2,3};
        System.out.println(pocketmon.solution(nums));
    }
}
