package backjoon.implement;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BackJoon1233 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int s1= Integer.parseInt(st.nextToken());
        int s2= Integer.parseInt(st.nextToken());
        int s3= Integer.parseInt(st.nextToken());


        for(int i=1;i<=s1;i++){
            for(int j=1;j<=s2;j++){
                for(int k=1;k<=s3;k++){
                    hashMap.put(i+j+k,hashMap.getOrDefault(i+j+k,0)+1);
                }
            }
        }

        int max = Collections.max(hashMap.values());
        for(Map.Entry<Integer,Integer> m : hashMap.entrySet()){
            if(m.getValue() == max) {
                System.out.println(m.getKey());
                break;
            }
        }
    }
}
