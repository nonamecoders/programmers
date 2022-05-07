package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Example {

    public static void bfs(int start, int[][] graph, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        visited[start] = true;

        while(!queue.isEmpty()) {
            int index = queue.poll();
            System.out.print(index + "->");

            for(int i=0; i<graph[index].length;i++) {
                int temp = graph[index][i];
                if(!visited[temp]){
                    visited[temp] = true;
                    queue.offer(temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

        // 방문처리를 위한 boolean배열 선언
        boolean[] visited = new boolean[9];

        bfs(1,graph,visited);

    }
}
