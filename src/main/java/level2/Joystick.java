package level2;

public class Joystick {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int min = len -1;

        for(int i=0; i<len; i++){
            answer += Math.min(name.charAt(i)-'A','Z'-name.charAt(i)+1);

            int next = i+1;

            while(next < len && name.charAt(next) =='A')
                next ++;

            min = Math.min(min,i+len-next+i);
        }
        answer += min;
        return answer;
    }

    public static void main(String[] args) {
        Joystick joystick = new Joystick();
        String name = "JEROEN";
        System.out.println(joystick.solution(name));
    }
}
