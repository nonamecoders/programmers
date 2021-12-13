package level1;

public class MrKim {
    public String solution(String[] seoul) {
        String answer = "";

        int index =0;
        for(String s : seoul){
            if(!s.equals("Kim")){
                index++;
            } else if(s.equals("Kim")){
                return "김서방은 " +index+"에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MrKim mrKim = new MrKim();
        String[] seoul = {"Jain","Kim"};
        System.out.println(mrKim.solution(seoul));
    }
}
