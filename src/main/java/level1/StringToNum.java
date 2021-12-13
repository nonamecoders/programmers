package level1;

public class StringToNum {

    public int solution(String s) {
        int result = Integer.parseInt(s);
        return result;
    }

    public static void main(String[] args) {
        StringToNum stringToNum = new StringToNum();
        String s = "1";
        System.out.println(stringToNum.solution(s));
    }
}
