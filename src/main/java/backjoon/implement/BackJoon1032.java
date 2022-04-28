package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon1032 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = 0;
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        if(n == 1) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println(st.nextToken());
        } else {
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                list.add(st.nextToken());
            }
            len = list.get(0).length();
            StringBuilder sb = new StringBuilder();

            for(int j=0;j<len;j++) {
                char c = 0;
                HashMap<Character,Integer> hashMap = new HashMap<>();
                for(int i=0;i<list.size();i++){

                    c = list.get(i).charAt(j);
                    hashMap.put(c,hashMap.getOrDefault(c,0)+1);
                }
                
                if (hashMap.size()>1) {
                    System.out.print("?");
                } else {
                    System.out.print(c);
                }
            }
        }
    }
}
