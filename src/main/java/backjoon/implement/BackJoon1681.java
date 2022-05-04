package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1681 {

    public static boolean cycle(int num,int L){

        while(true){
            if(num > 0){
                if(num%10 == L){
                    return false;
                }
                num/=10;
            } else {
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int L = Integer.parseInt(arr[1]);

        int count = 0;
        int num = 1;
        while(true){
            if(count < N) {
                boolean check = cycle(num,L);
                if(check) {
                    count++;
                }
                if(count == N) {
                    break;
                }
                num++;
            } else {
                break;
            }
        }
        System.out.println(num);
    }
}
