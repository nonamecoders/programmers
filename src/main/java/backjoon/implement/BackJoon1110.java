package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1110 {

    public int cycle (int main,int num,int count){

        int newNum =0;


        int ten = num/10;//2
        int one = num%10;//6 <<<이거 필요함

        int sum = ten + one;

        int newOne = sum%10;

        newNum = one*10 + newOne;

        if(main == newNum) {
            return count;
        } else {
            count++;
        }

        return cycle(main,newNum,count++);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        BackJoon1110 main = new BackJoon1110();
        System.out.println(main.cycle(num,num,1));

    }
}
