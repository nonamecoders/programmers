package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;


public class BackJoon5568 {

    static int k;
    static String[] arr;
    static Set<String> set;

    static void dfs(int start){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                set.add(arr[i]+arr[j]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
        }

        System.out.println(Arrays.toString(arr));


        dfs(0);


        System.out.println(set.size());
    }
}
