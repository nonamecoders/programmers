package level1;

public class FindRemain1 {
    public int solution(int n) {
        int answer = 0;

        int i=1;
        while(true){
            i++;
            if(n%i ==1){
                break;
            }

        }

        return i;
    }

    public static void main(String[] args) {
        FindRemain1 findRemain1 = new FindRemain1();
        int n =11;
        System.out.println(findRemain1.solution(n));
    }
}
