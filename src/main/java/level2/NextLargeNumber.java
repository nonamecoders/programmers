package level2;

public class NextLargeNumber {
    public int solution(int n) {
        int bi = Integer.bitCount(n);

        for(int i= n+1;;i++){
            if(bi == Integer.bitCount(i)){
                return(i);
            }
        }
    }

    public static void main(String[] args) {
        NextLargeNumber nextLargeNumber = new NextLargeNumber();
        int n = 78;
        System.out.println(nextLargeNumber.solution(n));
    }
}
