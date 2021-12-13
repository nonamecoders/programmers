package level1;

public class CountNumOfSrting {
    boolean solution(String s) {
        boolean answer = true;
        String p = "p";
        String y = "y";
        int count_p = 0;
        int count_y = 0;

        for (int i=0;i<s.length();i++){
            String char1 = String.valueOf(s.charAt(i));
            if(char1.equalsIgnoreCase(p)){
                count_p++;
            }
            if(char1.equalsIgnoreCase(y)){
                count_y++;
            }
        }
        if(count_p != count_y){
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        CountNumOfSrting countNumOfSrting = new CountNumOfSrting();
        String s = "pPooooyY";
        System.out.println(countNumOfSrting.solution(s));
    }
}
