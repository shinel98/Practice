package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 백준 온라인 저지 11724번
public class DFS {

    static List<Integer>[] nodeList;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        nodeList = new LinkedList[n+1];
        for(int i=1; i<n+1; i++) {
            nodeList[i] = new LinkedList<>();
        }
        visited = new boolean[n+1];

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            nodeList[s].add(e);
            nodeList[e].add(s);
        }

        int count = 0;
        for(int i=1; i<n+1; i++) {
            if(!visited[i]) {
                count++;
                Dfs(i);
            }
        }
        System.out.println(count);

    }
    static void Dfs(int v) {
        if(visited[v])
            return;
        visited[v] = true;
        for(int i : nodeList[v]) {
            if(!visited[i])
                Dfs(i);
        }
    }

}
