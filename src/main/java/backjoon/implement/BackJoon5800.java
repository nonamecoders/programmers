package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon5800 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            int count = Integer.parseInt(st.nextToken());
            for(int j=0;j<count;j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            int max = Collections.max(list);
            int min = Collections.min(list);

            Collections.sort(list,Collections.reverseOrder());
            System.out.println(list);
            int deff = list.get(0)-list.get(1);
            for(int k=1;k<list.size()-1;k++){
                deff = Math.max(list.get(k)-list.get(k+1),deff);
            }

            System.out.println("Class "+ (i+1));
            System.out.println("Max " + max+", Min " + min + ", Largest gap " + deff);
        }
    }
}
