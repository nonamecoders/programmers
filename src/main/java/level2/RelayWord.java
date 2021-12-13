package level2;

import java.util.LinkedList;

public class RelayWord {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        LinkedList<String> list = new LinkedList<>();

        String pre_last="";
        int count =0;
        int time =count/n;
        int person= count%n;

        for(int i=0;i<words.length;i++){
            if(i>0 && list.contains(words[i])){
                count =i;
            } else {
                list.add(words[i]);
            }

        }

        for(int i=0;i<list.size();i++){
            String this_first = list.get(i).substring(0,1);
            String this_last = list.get(i).substring(list.get(i).length()-1);

            if(i>0 && !this_first.equals(pre_last)){

                count =i;
                break;
            }

            pre_last = this_last;

        }

        if(count>0){
            time =count/n +1;
            person= count%n +1 ;
        }

        answer[0] = person;
        answer[1] = time;

        return answer;
    }

    public static void main(String[] args) {
        RelayWord relayWord = new RelayWord();

        int n =3;
        String[] words ={"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        for(int i : relayWord.solution(n,words))
            System.out.println(i);
    }

}
