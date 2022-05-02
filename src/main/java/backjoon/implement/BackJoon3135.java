package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon3135 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());// 현재
        int b = Integer.parseInt(st.nextToken());// 목표

        System.out.println(a);
        System.out.println(b);

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        if(list.contains(b)){
            System.out.println(1);
        } else {
            int diff1= Math.abs(a-b);
            int diff2=999;

           for(int i : list){
               diff2 = Math.abs(b-i) <  diff2 ? Math.abs(b-i) :diff2;

           }
            System.out.println(Math.min(diff1,diff2+1));
        }

    }
}
