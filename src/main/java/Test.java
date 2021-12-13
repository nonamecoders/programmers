
public class Test {
    static int N, totalCnt;
    static int[] input;
    static boolean[] isSelected;

    public static void main(String[] args) {
        N=4;
        input = new int[4];
        isSelected = new boolean[N];
        totalCnt=0;

        for(int i=0;i<N;i++){
            input[i] = i+1;
        }
        generateSubSet(0);
        System.out.println("경우의 수 : " + totalCnt);
    }

    public static void generateSubSet(int cnt){
        if(cnt==N){
            totalCnt++;
            for(int i=0; i<N; i++){
                System.out.print((isSelected[i] ? input[i]:"X")+ " ");
            }
            System.out.println();
            return;
        }
        isSelected[cnt]=true;
        generateSubSet(cnt+1);
        isSelected[cnt]=false;
        generateSubSet(cnt+1);
    }
}
