package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon1337 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            set.add(arr[i]);
        }

        int min = 4;
        for (int i = 0; i < n-1; i++) {
            int count = 1;
            //i 값으로 +4개까지 찾기 ex) i=3 >> 4,5,6,7 있는지 카운팅
            for (int j = arr[i]+1; j < arr[i]+5; j++) {
                if (set.contains(j))
                    count++;
            }
            min = Math.min(min, 5-count);
        }

        System.out.println(min);

    }
}
