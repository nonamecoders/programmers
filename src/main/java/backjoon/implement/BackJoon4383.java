package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon4383 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int c=0;c<2;c++) {
            List<Integer> list = new ArrayList<>();
            Set<Integer> jolly = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==1) {
                System.out.println("Jolly");

            } else {
                for (int i = 0; i < n; i++) {
                    list.add(Integer.parseInt(st.nextToken()));
                    if (i != n - 1)
                        jolly.add(i + 1);
                }

                for (int i = 0; i < n - 1; i++) {
                    int diff = Math.abs(list.get(i) - list.get(i + 1));
                    if (!jolly.contains(diff)) {
                        break;
                    } else {
                        jolly.remove(diff);
                    }
                }

                if (jolly.isEmpty()) System.out.println("Jolly");
                else System.out.println("Not jolly");
            }
        }
    }
}
