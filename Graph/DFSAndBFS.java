package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFSAndBFS {
    static List<Integer>[] nodeList;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        // 링크드리스트를 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start_point = Integer.parseInt(st.nextToken());

        nodeList = new LinkedList[node+1];
        visited = new boolean[node+1];

        for(int i=1; i<node+1; i++) {
            nodeList[i] = new LinkedList<>();
        }

        for(int i=1; i<edge+1; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            nodeList[s].add(e);
            nodeList[e].add(s);
        }
        for(int i=1; i<= node; i++){
            Collections.sort(nodeList[i]);
        }
        // DFS 실행
        DFS(start_point);
        System.out.println();
        // BFS 실행
        visited = new boolean[node+1];
        BFS(start_point);
        System.out.println();
    }

    static void DFS(int v) {
        if(visited[v])
            return;

        visited[v] = true;
        System.out.print(v + " ");
        for(int i: nodeList[v]) {
            if(!visited[i])
                DFS(i);
        }
    }

    static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int cur_node = queue.poll();
            System.out.print(cur_node + " ");
            for(int i: nodeList[cur_node]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
