package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BackJoon1260 {

    static List<Integer>[] graph;

    public static void dfs(int index, boolean[] visited){
        visited[index] = true;

        System.out.print(index + " ");

        for(int node : graph[index]){
            if(!visited[node]) {
                dfs(node,visited);
            }
        }
    }

    public static void bfs(int start, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        visited[start] = true;

        while(!queue.isEmpty()) {
            int index = queue.poll();
            System.out.print(index + " ");

            for(int node : graph[index]){
                if(!visited[node]){
                    visited[node] = true;
                    queue.offer(node);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        boolean[] visited_dfs = new boolean[n+1];
        boolean[] visited_bfs = new boolean[n+1];

        graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=1;i<=m;i++){
            String[] s = br.readLine().split(" ");
//            int[] arr2 = new int[2];
            // {1,2},{1,3},{1,4},{2,4},{3,4}
            // to : {{},{2,3,4},{1,4},{1,4},{1,2,3}}
            int node1 = Integer.parseInt(s[0]);
            int node2 = Integer.parseInt(s[1]);

            graph[node1].add(node2);
            graph[node2].add(node1);

        }
        for(int i=1;i<= n;i++){
            Collections.sort(graph[i]);
        }

        dfs(v,visited_dfs);
        System.out.println();
        bfs(v,visited_bfs);

    }
}
