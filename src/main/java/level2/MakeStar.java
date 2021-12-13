package level2;

import java.util.Arrays;
import java.util.HashSet;

public class MakeStar {
    static long min_x = Long.MAX_VALUE, min_y = Long.MAX_VALUE;
    static long max_x = Long.MIN_VALUE, max_y = Long.MIN_VALUE;

    public String[] solution(int[][] line) {
        String[] answer = {};
        HashSet<Point> pSet= new HashSet<>();

        long x, y;
        for(int i=0; i<line.length-1; i++){
            long a= line[i][0];
            long b= line[i][1];
            long e= line[i][2];
            for(int j=i+1; j<line.length; j++){
                long c= line[j][0];
                long d= line[j][1];
                long f= line[j][2];

                long adbc= a*d-b*c;
                if(adbc==0) continue;

                long bfed= b*f-e*d;
                if(bfed%adbc!=0) continue;

                long ecaf= e*c-a*f;
                if(ecaf%adbc!=0) continue;

                x= bfed/adbc;
                y= ecaf/adbc;
                pSet.add(new Point(x, y));

                min_x = Math.min(min_x, x);
                min_y = Math.min(min_y, y);
                max_x = Math.max(max_x, x);
                max_y = Math.max(max_y, y);
            }
        }

        long height= max_y - min_y +1;
        long width= max_x - min_x +1;
        answer= new String[(int)height];
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<width; i++){
            sb.append(".");
        }

        Arrays.fill(answer, sb.toString());

        long nx, ny;
        for(Point p: pSet){
            ny= max_y -p.y;
            nx= p.x- min_x;
            answer[(int)ny]= answer[(int)ny].substring(0, (int)nx)+"*"
                    +answer[(int)ny].substring((int)nx+1);
        }

        return answer;
    }

    public class Point{
        long x;
        long y;
        public Point(long x, long y){
            this.x= x;
            this.y= y;
        }
    }

    public static void main(String[] args) {
        MakeStar makeStar = new MakeStar();
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        for(String s : makeStar.solution(line))
            System.out.println(s);
    }
}
