package level1;

public class GetAvg {

    public double solution(int[] arr) {
        double answer = 0;

        for(int i : arr)
            answer +=i;

        return answer/arr.length;
    }

    public static void main(String[] args) {
        GetAvg getAvg = new GetAvg();
        int[] arr ={1,2,3,4};
        System.out.println(getAvg.solution(arr));
    }
}
