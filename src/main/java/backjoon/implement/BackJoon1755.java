package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BackJoon1755 {

    // 영어로 변환 or 숫자로 변환 시 사용할 배열
    static String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        LinkedList<String> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = m; i <= n; i++) {
            int ten = i / 10;
            int one = i % 10;
            if (ten == 0) {
                list.add(array[one]);
                continue;
            }
            list.add(array[ten] + " " + array[one]);
        }

        list.sort(null);

        while(!list.isEmpty()) {
            String temp = list.poll();
            if (temp.contains(" ")) {
                st = new StringTokenizer(temp);
                String t1 = st.nextToken();
                String t2 = st.nextToken();
                int ten = findnum(t1);
                int one = findnum(t2);
                list2.add(ten*10 + one);
            } else {
                list2.add(findnum(temp));
            }
        }

        while (!list2.isEmpty()) {
            for (int i = 0; i < 10; i++) {
                if (list2.isEmpty()) {
                    return;
                }
                System.out.print(list2.poll() + " ");
            }
            System.out.println();
        }
    }

    static int findnum(String input) {
        for (int i = 0; i <= 9; i++) {
            if (input.equals(array[i])) {
                return i;
            }
        }
        return 0;
    }
}