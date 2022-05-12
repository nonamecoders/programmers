package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon2798 {

    static int[] choice3 = new int[3];
    static int answer=0;

    static void cycle(int count,int start, int[] arr,int limit) {
        if(count==3){
            int sum=0;
//            System.out.println(Arrays.toString(choice3));
            for(int i: choice3)
                sum+=i;

            if(sum <= limit) {
                answer = limit-sum < limit - answer ? sum : answer;
            }
            return;
        }
        for(int i=start;i<arr.length;i++){
            choice3[count] = arr[i];
            cycle(count+1,i+1,arr,limit);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        cycle(0,0,arr,m);

        System.out.println(answer);

    }
}
