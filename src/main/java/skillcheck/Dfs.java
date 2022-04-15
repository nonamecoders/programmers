package skillcheck;

public class Dfs {

    public int dfs(int[] numbers,int node,int sum,int target){
        if(node==numbers.length){
            if(sum==target) return 1;
            else return 0;
        }
        return dfs(numbers,node+1,sum+numbers[node],target)
                + dfs(numbers,node+1,sum-numbers[node],target);

    }

    public int solution(int[] numbers,int target){

        return  dfs(numbers,0,0,target);

    }


    public static void main(String[] args) {

        Dfs dfs = new Dfs();
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(dfs.solution(numbers,target));


    }

}
