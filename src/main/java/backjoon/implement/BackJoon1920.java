package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon1920 {

    static int cycle(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        int mid = (end+start)/2;

        while(end-start>=0){
            if(arr[mid]== target) {
                return mid;
            } else if(arr[mid] <= target){
                start = mid +1;
            } else {
                end = mid-1;
            }
            mid = (end+start)/2;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer;

        int arrA[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);

        int m = Integer.parseInt(br.readLine());

        int arrB[] = new int[m] ;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        for(int num : arrB){
            answer = (cycle(arrA,num)) >= 0 ? 1 : 0;
            System.out.println(answer);
        }

    }
}
