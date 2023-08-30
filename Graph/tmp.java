package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class tmp {

    static List<Integer> list[];
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        list = new LinkedList[N+1];

        for(int i=1; i<= N; i++) {
            list[i] = new LinkedList<>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        for(int i=1; i<=N; i++) {
            Collections.sort(list[i]);
        }

        visited = new boolean[N+1];
        Dfs(start);
        System.out.println();
        visited = new boolean[N+1];
        Bfs(start);
        System.out.println();


    }
    public static void Dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;
        for(int i : list[node]) {
            if(!visited[i]) {
                visited[i] = true;
                Dfs(i);
            }
        }
    }

    public static void Bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while(!queue.isEmpty()) {
            int cur_node = queue.poll();
            System.out.print(cur_node + " ");
            for(int i: list[cur_node]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}


