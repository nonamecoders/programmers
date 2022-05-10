package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1236 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int col_count =0;
        int row_count =0;

        boolean [][] arr = new boolean[n][m];
        for(int i=0;i<n; i++){
            String s = br.readLine();// ....
            for(int j=0; j<m;j++){
                if(s.charAt(j)=='.')
                    arr[i][j] = false;
                else
                    arr[i][j] = true;
            }
        }

        for(int i=0;i<m;i++){
            int count =0;
            for(int j=0; j<n; j++){
                if(!arr[j][i]){
                    count ++;
                }
            }
            if(count == n)
                col_count++;
        }

        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0; j<m; j++){
                if(!arr[i][j]){
                    count ++;
                }
            }
            if(count == m)
                row_count++;
        }

        if (row_count >= col_count) {
            System.out.println(row_count);
        } else
            System.out.println(col_count);
    }
}
