package level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OpenChat {

    public String[] solution(String[] record) {
        Map<String,String> map = new HashMap<>();
        List<String[]> list = new LinkedList<>();

        for(String rec : record){
            String[] keyword = rec.split(" ");

            if(keyword[0].equals("Enter")){
                map.put(keyword[1],keyword[2]);
                list.add(keyword);
            }else if (keyword[0].equals("Change")){
                map.put(keyword[1],keyword[2]);
            } else{
                list.add(keyword);
            }
        }
        int index = 0;
        String[] answer = new String[list.size()];
        for(String[] array : list){
            String name= map.get(array[1]);

            if(array[0].equals("Enter")){
                answer[index++] = name+"님이 들어왔습니다.";
            } else {
                answer[index++] = name+"님이 나갔습니다.";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        OpenChat openChat = new OpenChat();
        String[] record ={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        for(String s : openChat.solution(record))
            System.out.println(s);

    }
}
