package level1;

public class MinRectAngle {
    public int solution(int[][] sizes) {
        int answer =0;
        for(int i=0; i< sizes.length;i++){
            int[] size = sizes[i];
            int a = size[0];
            int b = size[1];

            if(a<b){
                size[0] = b;
                size[1] = a;
            }

            sizes[i][0] =size[0];
            sizes[i][1] =size[1];
        }

        int max_a =0;
        int max_b =0;
        for(int i=0;i<sizes.length;i++){
            if(i==0){
                max_a = sizes[i][0];
                max_b = sizes[i][1];
            } else {
                if(max_a < sizes[i][0]){
                    max_a = sizes[i][0];
                }
                if(max_b < sizes[i][1]){
                    max_b = sizes[i][1];
                }
            }
        }

        answer = max_a * max_b;

        return answer;
    }

    public static void main(String[] args) {
        MinRectAngle minRectAngle = new MinRectAngle();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(minRectAngle.solution(sizes));
    }
}
