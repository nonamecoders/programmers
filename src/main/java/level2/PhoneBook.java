package level2;

import java.util.HashMap;

public class PhoneBook {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,Integer> map = new HashMap<>();

        for(int i =0; i<phone_book.length;i++)
            map.put(phone_book[i],i);

        for(int i=0;i<phone_book.length; i++){
            for(int j=1;j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer=false;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.solution(phone_book));



    }
}
