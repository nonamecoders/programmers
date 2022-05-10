package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon1205 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int point = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        if(n==0){
            System.out.println(1);
        } else {
            String[] s = br.readLine().split(" ");
            List<Integer> list = new ArrayList<>();
            list.add(point);

            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(s[i]));
            }

            Collections.sort(list, Collections.reverseOrder());


            int size = list.size();
            if (n == limit && point <= list.get(size - 1))
                System.out.println(-1);
            else {
                int rank = 1;
                for (int i = 0; i < list.size(); i++) {
                    if (point < list.get(i)) {
                        rank++;
                    } else break;
                }
                System.out.println(rank);
            }
        }
    }
}
