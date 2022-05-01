package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BackJoon1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] arr = s.toUpperCase().toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : arr)
            map.put(c,map.getOrDefault(c,0)+1);

        char maxKey = '0';
        int maxValue=0;
        for(char key : map.keySet()) {
            int value = map.get(key);
            if(value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        int finalMaxValue = maxValue;
        Set<Character> findKey = map.entrySet()
                                    .stream()
                .filter(entry-> Objects.equals(entry.getValue(), finalMaxValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        if(findKey.size()>1) {
            System.out.println("?");
        } else {
            System.out.println(maxKey);
        }

    }
}
