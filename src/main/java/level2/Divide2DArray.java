package level2;

import java.util.ArrayList;
import java.util.List;

public class Divide2DArray {
    public  List<Long> solution(int n, long left, long right) {

        List<Long> list = new ArrayList<>();

        for(long i=left;i<right+1;i++){
            list.add(Math.max(i/n,i%n) + 1);
        }

        return list;
    }

    public static void main(String[] args) {
        Divide2DArray divide2DArray = new Divide2DArray();
        int n =3;
        int left = 2;
        int right =5;
        System.out.println(divide2DArray.solution(n,left,right));
    }
}
