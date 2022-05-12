package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon11650 {
    static class Point{
        int x;
        int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Point() {
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();

        for(int i =0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            Point point = new Point();
            point.setX(Integer.parseInt(st.nextToken()));
            point.setY(Integer.parseInt(st.nextToken()));
            list.add(point);

        }

        list.sort(Comparator.comparing(Point::getX).thenComparing(Point::getY));

        StringBuilder sb= new StringBuilder();
        for(Point p : list) {
            sb.append(p.getX() + " " + p.getY()).append("\n");
        }

        System.out.println(sb);
    }
}
