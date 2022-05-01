package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BackJoon1268 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger aDecimal = new BigInteger(st.nextToken(),2);
        BigInteger bDecimal = new BigInteger(st.nextToken(),2);

        BigInteger sum = aDecimal.add(bDecimal);

        System.out.println(sum.toString(2));

    }
}
