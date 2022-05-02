package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class BackJoon11292 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            int t = Integer.parseInt(br.readLine());
            if(t ==0) break;
            else {
                LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
                for(int i=0;i<t;i++) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String name = st.nextToken();
                    int height = Integer.parseInt(st.nextToken().replace(".", ""));
                    map.put(name,height);
                }
                Comparator<Entry<String,Integer>> comparator = new Comparator<Entry<String, Integer>>() {
                    @Override
                    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                };

                Entry<String,Integer> max = Collections.max(map.entrySet(),comparator);
                int maxValue = max.getValue();
                for(String key : map.keySet()){
                    if(map.get(key) == maxValue){
                        System.out.println(key);
                    }
                }
            }
        }

    }
}
