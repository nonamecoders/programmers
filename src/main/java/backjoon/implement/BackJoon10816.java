package backjoon.implement;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BackJoon10816 {


    private static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {

            int mid = (start + end) / 2; // 중간위치를 구한다.

            /*
             *  target 값이 중간 위치의 값보다 작거나 같을 경우
             *
             *  (중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.)
             */
            if (target <= arr[mid]) {
                end = mid;
            }

            else {
                start = mid + 1;
            }

        }

        return start;
    }

    private static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        // lo가 hi랑 같아질 때 까지 반복
        while (start < end) {

            int mid = (start + end) / 2; // 중간위치를 구한다.

            // key값이 중간 위치의 값보다 작을 경우
            if (target < arr[mid]) {
                end = mid;
            }
            // 중복원소의 경우 else에서 처리된다.
            else {
                start = mid + 1;
            }

        }

        return start;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int[] nArr = new int[n];

        for(int i=0;i<n;i++){
            nArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nArr);

        int m = Integer.parseInt(br.readLine());
//        map.getOrDefault 이거 써도 가능
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            int target = Integer.parseInt(st.nextToken());
            sb.append( upperBound(nArr,target) - lowerBound(nArr,target)).append(" ");
        }

        System.out.println(sb);
    }
}
