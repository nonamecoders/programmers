package level2;

import java.util.ArrayList;
import java.util.Collections;

public class NewsCluster {

    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<String> union = new ArrayList<>();
    ArrayList<String> intersection = new ArrayList<>();


    public int solution(String str1, String str2) {
        int answer = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i =0; i<str1.length()-1;i++){
            String s= str1.substring(i,i+2);
            char c1,c2;
            c1 = s.charAt(0);
            c2 = s.charAt(1);

            if((c1 >=97 && c1<= 122) && (c2 >=97 && c2<= 122)){
                list1.add(s);
            }
        }

        for(int i =0; i<str2.length()-1;i++){
            String s= str2.substring(i,i+2);
            char c1,c2;
            c1 = s.charAt(0);
            c2 = s.charAt(1);

            if((c1 >=97 && c1<= 122) && (c2 >=97 && c2<= 122)){
                list2.add(s);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);


        for(String s : list1){
            if(list2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }

        for(String s : list2){
            union.add(s);
        }

        double interSize = intersection.size();
        double unionSize = union.size();

        if(unionSize ==0) answer = 65536;
        else answer = (int) Math.floor((interSize/unionSize)*65536l);

        return answer;
    }

    public static void main(String[] args) {
        NewsCluster newsCluster = new NewsCluster();

        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(newsCluster.solution(str1,str2));
    }
}
