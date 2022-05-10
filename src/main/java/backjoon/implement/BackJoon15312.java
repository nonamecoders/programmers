package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon15312 {

    public static void main(String[] args) throws IOException {

        int[] alphabet = { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        int aLen = a.length;
        int bLen = b.length;

        int[] arr = new int[aLen+bLen];

        for(int i=0; i<a.length;i++){
            arr[2*i] = alphabet[a[i] -65];
            arr[2*i+1] = alphabet[b[i] -65];
        }

        int sum = 0;
        int[] arr2 = new int[4000];
        while(true) {
            arr2 = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                sum = arr[i] + arr[i + 1];
                if(sum >= 10) sum -=10;
                arr2[i] = sum;
            }
            arr = arr2;
            if(arr.length == 2) {
                break;
            }

        }
        for(int i : arr2){
            System.out.print(i);
        }

    }
}
