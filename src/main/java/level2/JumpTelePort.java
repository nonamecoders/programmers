package level2;

public class JumpTelePort {
    public int solution(int n) {
        int answer = 0;

        while (n!=0){
            if(n%2 ==0){
                n /=2;
            } else{
                n--;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        JumpTelePort jumpTelePort = new JumpTelePort();
        int N = 5;
        System.out.println(jumpTelePort.solution(N));
    }
}
