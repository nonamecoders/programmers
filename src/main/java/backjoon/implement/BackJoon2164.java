package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BackJoon2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());

        for(int i=1;i<=num;i++){
            queue.add(i);
        }


        while(true) {
            if(queue.size()==1) {
                System.out.println(queue.poll());
                break;
            } else {
                queue.poll();
                queue.add(queue.poll());
            }
        }

    }
}