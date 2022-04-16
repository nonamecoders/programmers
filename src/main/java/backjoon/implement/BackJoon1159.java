package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BackJoon1159 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Character,Integer> hashMap = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            String s = br.readLine();
            char c = s.charAt(0);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }

        String s ="";

        for(Character key : hashMap.keySet()){
            if(hashMap.get(key) >= 5){
                s+= key;
            }
        }
        if(s.length() >0)
            System.out.println(s);
        else
            System.out.println("PREDAJA");

    }
}
