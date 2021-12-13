package level1;

public class SumPlusMinus {

    public int solution(int[] absolutes, boolean[] signs) {
        int index =0;
        int sum=0;
        for(int i =0; i<absolutes.length; i++){
            if(signs[i] == true)
                index = absolutes[i];
            else index = absolutes[i] * -1;
            sum += index;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumPlusMinus sumPlusMinus = new SumPlusMinus();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(sumPlusMinus.solution(absolutes,signs));
    }
}
