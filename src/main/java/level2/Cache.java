package level2;

import java.util.LinkedList;
import java.util.List;

public class Cache {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new LinkedList<>();

        if (cacheSize ==0) return cities.length*5;

        for(int i=0; i < cities.length; i++){
            String city =  cities[i].toUpperCase();

            if(cache.size()<cacheSize) {
                if(cache.contains(city)){
                    cache.remove(city);
                    cache.add(city);
                    answer+=1;
                } else {
                    cache.add(city);
                    answer+=5;
                }
            } else if (cache.size() >=cacheSize ){
                //캐시에 포함되어있으면?
                if(cache.contains(city)){
                    cache.remove(city);
                    cache.add(city);
                    answer += 1;
                }else {
                    cache.remove(0);
                    cache.add(city);
                    answer += 5;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Cache cache = new Cache();
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        System.out.println(cache.solution(cacheSize,cities));

    }
}
