package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon11651 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< N ; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }

//    static class Point{
//        int x;
//        int y;
//
//        public int getX() {
//            return x;
//        }
//
//        public void setX(int x) {
//            this.x = x;
//        }
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//
//        public Point() {
//        }
//
//        @Override
//        public String toString() {
//            return "Point{" +
//                    "x=" + x +
//                    ", y=" + y +
//                    '}';
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int n = Integer.parseInt(br.readLine());
//
//        List<Point> list = new ArrayList<>();
//
//        for(int i =0;i<n;i++){
//            st = new StringTokenizer(br.readLine());
//            Point point = new Point();
//            point.setX(Integer.parseInt(st.nextToken()));
//            point.setY(Integer.parseInt(st.nextToken()));
//            list.add(point);
//
//        }
//        list.sort(Comparator.comparing(Point::getY).thenComparing(Point::getX));
//
//        StringBuilder sb= new StringBuilder();
//        for(Point p : list){
//            sb.append(p.getX() + " " + p.getY()).append("\n");
//        }
//        System.out.println(sb);
//    }

}
