package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> arr1= new ArrayList<>();
        List<Integer> arr2= new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++){
            arr1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++){
            arr2.add(Integer.parseInt(st.nextToken()));
        }

        arr1.sort(null);
        Collections.sort(arr2,Collections.reverseOrder());
        int answer = 0;
        for(int i=0;i<n;i++){
            answer += arr1.get(i) * arr2.get(i);
        }

        System.out.println(answer);
    }
}
