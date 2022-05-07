package dfs;

import java.util.Stack;

public class DFS_Stack {

    static boolean[] visited = new boolean[9];

    // index:0 >> 빈배열 세팅, index는 각 노드 번호이고 배열은 해당 index 노드의 인접 노드의 집합.
    static int[][] graph ={{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

    static Stack<Integer> stack = new Stack<>();

    public static void dfs(int index){
        stack.push(index);
        visited[index] =true;

        while(!stack.isEmpty()) {
            int nodeIndex = stack.pop();
            System.out.print(nodeIndex + "->");

            for(int node : graph[nodeIndex]) {
                if(!visited[node]){
                    stack.push(node);
                    visited[node] =true;
                }
            }
        }
    }

    public static void main(String[] args) {
        dfs(1);
    }
}
