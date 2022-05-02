package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            list.add(Integer.parseInt(st.nextToken()));

        }
        Collections.sort(list);

        //시간초과로인한 시간복잡도 확인
        // quicksort, timsort 비교
        for(int i : list){
            sb.append(i).append('\n');
        }
        System.out.println(sb);

    }
}
