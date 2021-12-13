package level1;

public class Keypad {
    public static int getLength (int index, int number){
        index= (index==0) ? 11 : index;
        number= (number==0) ? 11 : number;

        int x = (index-1) / 3;
        int y = (index-1) % 3;
        int numberX = number/3;
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
    public String solution(int[] numbers, String hand) {

        int left = 10;
        int right = 12;

        String result="";

        for(int number : numbers){
            if(number == 1|| number == 4 || number == 7){
                result +="L";
                left = number;
            } else if (number == 3|| number == 6 || number == 9){
                result +="R";
                right = number;
            } else {
                int leftLength = getLength(left,number);
                int rightLength = getLength(right,number);

                if(leftLength > rightLength){
                    result +="R";
                    right = number;
                } else if (leftLength < rightLength){
                    result +="L";
                    left = number;
                } else {
                    if(hand.equals("right")){
                        result +="R";
                        right = number;
                    } else {
                        result +="L";
                        left = number;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        Keypad keypad = new Keypad();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(keypad.solution(numbers,hand));
    }

}
