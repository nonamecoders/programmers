package learn.hash;

import java.util.HashMap;

public class Phonebook {
    public boolean solution (String [] phone_book){

        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0; i<phone_book.length;i++)
            hm.put(phone_book[i],i);

        for(int i=0;i< phone_book.length;i++){
            for(int j=1;j< phone_book[i].length();j++){
                if(hm.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {

        String [] phone_book = {"119","97674223","1195524421"};

        Phonebook phonebook = new Phonebook();
        System.out.println(phonebook.solution(phone_book));
    }

}
