package level2;

public class TargetNumber {

    public int dfs(int[] numbers,int node,int sum,int target){
        if(node == numbers.length){
            if(sum==target) return 1;
            else return 0;
        }
        return  dfs(numbers,node+1,sum+numbers[node],target)
                + dfs(numbers,node+1,sum-numbers[node],target);

    }

    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers,0,0,target);
        return answer;
    }
}
