import level1.IntegerDesc;

public class Interpark {

    public int solution(int n){

        int open =0;
        int[] arr = new int[n+1];

        for(int i=0;i<n+1;i++){
            if(i==0)
                arr[i] = 2;
            else if (i >0 && i%2== 0 ){
                arr[i] =0;
            } else
                arr[i] =1;
        }
        for(int i=1;i<n+1;i++){
            if(i%3==0){
                if(arr[i]==1){
                    arr[i] =0;
                } else {
                    arr[i] =1;
                }
            }
        }

        for(int i : arr){
            if(i == 1) open++;
        }
        return open;
    }


    public static void main(String[] args) {
        Interpark sol = new Interpark();
        System.out.println(sol.solution(12));

    }
}
