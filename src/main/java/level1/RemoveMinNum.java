package level1;

public class RemoveMinNum {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] answer_ = new int[1];
        answer_[0] = -1;

        int remove =0;

        if(arr.length <=1){
            return answer_;
        }

        for(int i=0; i<arr.length;i++){
            if(i==0){
                remove =arr[i];
            } else {
                remove = remove > arr[i] ? arr[i] : remove;
            }
        }
        int index=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] != remove){
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveMinNum removeMinNum = new RemoveMinNum();
        int[] arr = {4,3,2,1};
        System.out.println(removeMinNum.solution(arr));
    }
}
