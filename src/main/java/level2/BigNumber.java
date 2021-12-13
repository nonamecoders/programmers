package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigNumber {

    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        for(int i: numbers)
            list.add(String.valueOf(i));

        Collections.sort(list,(a, b)->(b+a).compareTo(a+b));

        if(list.get(0).startsWith("0")) return "0";
        for(String s :list)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        BigNumber bigNumber = new BigNumber();
        int[] numbers = {6,10,2};
        System.out.println(bigNumber.solution(numbers));
    }
}
