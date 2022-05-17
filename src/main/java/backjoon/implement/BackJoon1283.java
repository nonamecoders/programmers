package backjoon.implement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//todo

public class BackJoon1283 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        List<String> cheatList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            boolean flag = false;
            String key="";
            String word = br.readLine();
            String[] wordArr = word.split(" ");

            //wordArr[0]: save, wordArr[1] : as

            //step1 : 배열 첫글자 대문자
            for(int j=0;j<wordArr.length;j++){
                String s = wordArr[j];
                key = String.valueOf(wordArr[j].charAt(0));
                if(!cheatList.contains((key.toUpperCase()))){
                    cheatList.add(key.toUpperCase());
                    for(int k=0;k< wordArr.length;k++){
                        if(k==j){
                            bw.write("[" + s.substring(0, 1) + "]" + s.substring(1) +" ");
                        } else {
                            bw.write(wordArr[k] + " ");
                        }
                    }
                    bw.write("\n");
                    flag =true;
                    break;
                }
            }
            if(!flag){
                for(int j=0;j<wordArr.length;j++){
                    String[] split = wordArr[j].split("");
                    for(int k=1;k<split.length;k++){
                        key = split[k];
                        if(key.equals(" ")){
                            continue;
                        }
                        if(!cheatList.contains(key.toUpperCase())){
                            cheatList.add(key.toUpperCase());
                            flag=true;
                            bw.write(word.substring(0,k) + "[" + word.substring(k,k+1) + "]" + word.substring(k+1) + "\n");
                            break;
                        }

                    }
                    if(flag){
                        break;
                    }
                }
            }

            if(!flag){

                bw.write(word+"\n");
            }
            bw.flush();

        }

    }
}
