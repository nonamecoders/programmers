package level1;

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int sum =0;
        for(int i =0; i <a.length; i++)
            sum += a[i] * b[i];

        return sum;
    }

    public static void main(String[] args) {
        DotProduct dotProduct = new DotProduct();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(dotProduct.solution(a,b));
    }
}
