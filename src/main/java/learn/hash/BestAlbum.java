package learn.hash;

import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class BestAlbum {

    static List<Integer> resultList = new ArrayList<>();

    public void topTwo(List<Integer> list,int[] plays){
        List<Integer> result = new ArrayList<>();
        int max_value=-1;
        int second_value=-1;
        int max_index = -1;
        int second_index = -1;

        if(list.size()<2){
            resultList.add(list.get(0));
            return;
        }

        max_value = plays[list.get(0)];
        max_index = list.get(0);
        for(int i=1;i<list.size();i++){
            if(plays[list.get(i)] > max_value){
                second_value = max_value;
                max_value = plays[list.get(i)];
                second_index = max_index;
                max_index = list.get(i);
            } else if (plays[list.get(i)] > second_value){
                second_value = plays[list.get(i)];
                second_index = list.get(i);
            }
        }

        resultList.add(max_index);
        if(second_index >-1)
            resultList.add(second_index);

    }


    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        //카테고리별로 두개씩 많은거
        //장르 내에서 가장 많이 재생된 노래 먼저
        //장르 내에서 재생 횟수가 같으면 고유번호가 낮은 노래를 먼저

        //장르별 총 재생횟수
        HashMap<String,Integer> total_play = new HashMap<>();
        //장르별 최대 횟수 인덱스(최대 2개)
        HashMap<String,List<Integer>> map = new LinkedHashMap<>();
        List<Integer> rating = new ArrayList<>();

        for(int i=0;i<genres.length;i++){

            total_play.put(genres[i], total_play.getOrDefault(genres[i],0)+plays[i]);

            if(!map.isEmpty() && map.containsKey(genres[i])){
                rating = map.get(genres[i]);
            } else {
                rating = new ArrayList<>();
            }
            rating.add(i);

            map.put(genres[i],rating);
        }

        List<Map.Entry<String,Integer>> entryList = new ArrayList<Entry<String,Integer>>(total_play.entrySet());

        Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

            public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
            {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });


        for(int i=0;i<entryList.size();i++){
            String key = entryList.get(i).getKey();
            topTwo(map.get(key),plays);
        }

        answer = resultList.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
//        String [] genres = {"classic","classic","classic"};
//        int [] plays = {550,600,500};

//        String [] genres = {"opera","kpop","rock"};
//        int [] plays = {400,200,1100};

        String [] genres = {"classic", "pop", "classic", "classic", "pop","kpop","opera","kpop","opera","rock"};
        int [] plays = {150,600,500,800,2500,300,400,200,1000,1100};

//        String [] genres = {"classic", "pop", "classic", "classic", "pop"};
//        int [] plays = {500,600,150,800,2500};
//        String [] genres = { "pop","pop","pop"};
//        int [] plays = {800,600,2500};

         BestAlbum bestAlbum = new BestAlbum();

         int [] result = bestAlbum.solution(genres,plays);
         for (int i : result)
             System.out.println(i);
    }
}
