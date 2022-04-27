package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int crossIndex = 1, blockSum = 0;

        while (true) {
            if (x <= blockSum + crossIndex) {

                if (crossIndex%2 == 1) {	// 대각선의 개수가 홀수라면

                    System.out.print((crossIndex - (x - blockSum - 1)) + "/" + (x - blockSum));
                    break;
                }

                else {
                    System.out.print((x - blockSum) + "/" + (crossIndex - (x - blockSum - 1)));
                    break;
                }

            } else {
                blockSum += crossIndex;
                crossIndex++;
            }
        }

    }
}
