package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        List<String> answer= new ArrayList<>();

        for(int i=0;i<n;i++) {
            String[] arr =br.readLine().split(" ");
            String name = arr[0];
            String behave = arr[1];
            if(behave.equals("enter")){
                set.add(name);
            } else if(behave.equals("leave")){
                if(set.contains(name))
                    set.remove(name);
            }
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext())
            answer.add(it.next());

        Collections.sort(answer,Collections.reverseOrder());
        answer.forEach(System.out::println);
    }
}
