package level1;

public class FindRemain1 {

    //나머지가 1인 제일 작은 수
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
        int n =13;
        System.out.println(findRemain1.solution(n));
    }
}
