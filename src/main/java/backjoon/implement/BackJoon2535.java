package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BackJoon2535 {

    public static class Rating {

        int nation;
        int num;
        int score;

        public Rating() {

        }

        public int getNation() {
            return nation;
        }

        public int getNum() {
            return num;
        }

        public int getScore() {
            return score;
        }

        public void setNation(int nation) {
            this.nation = nation;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Rating> list=  new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] arr = br.readLine().split(" ");
            int nation =  Integer.parseInt(arr[0]);
            int num =  Integer.parseInt(arr[1]);
            int score =  Integer.parseInt(arr[2]);

            Rating rating = new Rating();
            rating.setNation(nation);
            rating.setNum(num);
            rating.setScore(score);
            list.add(rating);

        }

        list.sort(Comparator.comparing(Rating::getScore).reversed());

        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Rating r : list) {
            if(count < 3) {
                map.put(r.getNation(), map.getOrDefault(r.getNation(), 0) + 1);
                if (map.containsKey(r.getNation())) {
                    if (map.get(r.getNation()) < 3) {
                        System.out.println(r.getNation() + " " + r.getNum());
                        count++;
                    }

                }
            }
        }
    }
}
