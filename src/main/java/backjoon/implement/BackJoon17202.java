package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BackJoon17202 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = br.readLine().split("");
        String[] arr2 = br.readLine().split("");

        int[] numArr = new int[16];
        for(int i=0;i<arr1.length;i++){
            numArr[2*i] =  Integer.parseInt(arr1[i]);
            numArr[2*i+1] =  Integer.parseInt(arr2[i]);
        }
        int[] result = new int[16];
        int sum =0;
        while(true) {
            result = new int [numArr.length-1];
            for(int i=0;i<result.length;i++){
                sum = numArr[i] + numArr[i+1];
                if(sum >= 10) sum -=10;
                result[i] =sum;
            }
            numArr = result;
            if(numArr.length==2){
                break;
            }

        }

        for(int i : result) {
            System.out.print(i);
        }
    }
}
