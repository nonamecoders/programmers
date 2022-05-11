package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon18511 {

    static int answer;

    static void dfs(int now, int[] arr, int limit) {
        if(now > limit) return;
        if(answer<now) answer = now;
        for(int i=arr.length-1; i>-1;i--){
            dfs(now*10+arr[i],arr,limit);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<k;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0,arr,n);

        System.out.println(answer);

    }
}
