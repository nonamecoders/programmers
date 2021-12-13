package level2;

public class BinaryCycle {

    int count =0;
    int  zero =0;

    public int[] solution(String s) {
        int[] answer = new int[2];

        cycle(s);

        answer[0] = count;
        answer[1] = zero;

        return answer;
    }

     private void cycle(String s){
        int len = s.length();

        if (s.length() ==1) return;
        int this_zero=0;
        for(char c : s.toCharArray()){
            if(c=='0') {
                this_zero ++;
            }
        }
        zero += this_zero;

        int trans_len = len - this_zero;

        String trans_string = Integer.toBinaryString(trans_len);

        count++;

        cycle(trans_string);

    }

    public static void main(String[] args) {
        BinaryCycle binaryCycle = new BinaryCycle();
        String s = "110010101001";
        for(int i: binaryCycle.solution(s))
            System.out.println(i);
    }

}
