package level1;

public class MakeArrayReverseNum {

    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeArrayReverseNum makeArrayReverseNum = new MakeArrayReverseNum();
        long n = 12345;
        System.out.println(makeArrayReverseNum.solution(n));
    }

}
