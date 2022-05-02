package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon2693 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<10;j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list,Collections.reverseOrder());

            System.out.println(list.get(2));

        }

    }
}
