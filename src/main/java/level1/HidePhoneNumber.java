package level1;

public class HidePhoneNumber {

    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0; i< phone_number.length()-4; i++){
            ch[i] ='*';
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        HidePhoneNumber hidePhoneNumber = new HidePhoneNumber();
        String phone_number = "01033334444";
        System.out.println(hidePhoneNumber.solution(phone_number));
    }
}
