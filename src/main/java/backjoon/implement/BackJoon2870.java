package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BackJoon2870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<BigInteger> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i<n;i++) {
            String[] s = br.readLine().split("\\D");
            for(int j=0; j<s.length;j++){
                if(!s[j].equals("")){
                    list.add(new BigInteger(s[j]));
                }
            }
        }

        Collections.sort(list);


        StringBuilder sb = new StringBuilder();
        for(BigInteger num : list) sb.append(num+"\n");

        System.out.println(sb);
    }

}
