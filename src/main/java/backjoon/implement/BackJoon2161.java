package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BackJoon2161 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=1;i<=n;i++){
            deque.add(i);
        }
        for(int i=0;i<deque.size();i++){
            while(true){
                if(deque.size()==1){
                    break;
                } else {
                    System.out.println(deque.removeFirst());
                    deque.addLast(deque.pollFirst());
                }

            }
        }

        System.out.println(deque.pop());
    }
}
