package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        TreeSet<String> hashSet = new TreeSet<>();

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            hashSet.add(a);
        }

        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        list.forEach(System.out::println);
    }
}
