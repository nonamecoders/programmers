package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BackJoon9536 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list;

        int n = Integer.parseInt(br.readLine());


        for(int i=0;i<n;i++) {
            list = new ArrayList<>();
            String[] animalSound = br.readLine().split(" ");

            String sound = "";

            while (true) {
                String[] soundArr = br.readLine().split(" ");
                sound = soundArr[2];
                if(!sound.equals("the")){
                    list.add(sound);
                } else {
                    break;
                }
            }

            for(int j=0;j<animalSound.length;j++){
                if(!list.contains(animalSound[j])){
                    System.out.print(animalSound[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
