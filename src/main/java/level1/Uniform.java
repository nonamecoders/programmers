package level1;

public class Uniform {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] student = new int[n];

        for (int i:lost) student[i-1]--;
        for (int i:reserve) student[i-1]++;

        for (int i=0;i<student.length;i++) {

            if (student[i] == -1) {
                if (i>0 && student[i-1]==1) {
                    student[i]++;
                    student[i-1]--;
                } else if (i<n-1 && student[i+1] == 1) {
                    student[i]++;
                    student[i+1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Uniform uniform = new Uniform();
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        System.out.println(uniform.solution(n,lost,reserve));
    }
}
