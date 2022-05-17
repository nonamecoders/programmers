package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon4383 {

    static boolean[] temp;
    //todo
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if(st.countTokens() > 1) {

                int n = Integer.parseInt(st.nextToken());
                int[] arr = new int[n];
                temp = new boolean[3000];
                if (n == 1) {
                    System.out.println("Jolly");

                } else {
                    for (int i = 0; i < n; i++) {
                        arr[i] = Integer.parseInt(st.nextToken());
                    }
                    for (int i = 0; i < arr.length - 1; i++) {
                        int sum = Math.abs(arr[i] - arr[i + 1]);
                        temp[sum] = true;
                    }
                System.out.println(Arrays.toString(temp));


                    for (int i = 1; i < n; i++) {
                        if (temp[i] != true) {
                            System.out.println("Not jolly");
                            break;
                        }
                        if (i == n - 1)
                            System.out.println("Jolly");
                    }
                }
            } else {
                break;
            }
        }
    }
}
