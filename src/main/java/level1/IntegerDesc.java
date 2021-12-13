package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class IntegerDesc {


    public long solution(long n) {
        StringBuffer sb= new StringBuffer();
        int[] arrNum = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        List<Integer> list =  new ArrayList<>();

        for(int i:arrNum)
            list.add(i);

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0;i<list.size();i++){
            sb.append(list.get(i));
        }

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        IntegerDesc integerDesc = new IntegerDesc();
        long n = 118372;
        System.out.println(integerDesc.solution(n));
    }

}
