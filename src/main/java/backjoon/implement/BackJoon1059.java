package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BackJoon1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<L;i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }

        int N = Integer.parseInt(br.readLine());
        if(list.contains(N)) System.out.println(0);
        else {
            list.add(N);
            list.sort(null);

            //구간 설정
            if(list.get(0)==N) {
                //N이 제일 집합에서 제일 작을 때
                //N보다 큰 집합의 수까지 설정
                int x = list.get(list.indexOf(N)+1);
                System.out.println((x-N)*N-1);
            } else {
                //구간 설정
                int min = N-list.get(list.indexOf(N)-1);
                int max = list.get(list.indexOf(N)+1)-N;

                System.out.println(max * min -1);
            }
        }
    }
}
