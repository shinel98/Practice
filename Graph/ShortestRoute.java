package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 백준 1753번
public class ShortestRoute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        int[] distance = new int[V+1];
        boolean[] visited = new boolean[V+1];
        List<Edge> list[] = new ArrayList[V+1];

        for(int i=1; i<=V; i++)
            list[i] = new ArrayList<Edge>();

        for(int i=0; i<=V; i++)
            distance[i] = Integer.MAX_VALUE;

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Edge(v, w));
        }


        PriorityQueue<Edge> q = new PriorityQueue<>();
        q.add(new Edge(K, 0));
        distance[K] = 0;

        while(!q.isEmpty()) {
            Edge current = q.poll();
            int c_v  = current.vertex;

            if(visited[c_v]) continue;
            visited[c_v] = true;

            for(int i=0; i<list[c_v].size(); i++) {
                Edge tmp = list[c_v].get(i);
                int next = tmp.vertex;
                int value = tmp.value;

                if(distance[next] > distance[c_v] + value) {
                    distance[next] = distance[c_v] + value;
                    q.add(new Edge(next, distance[next]));
                }
            }
        }

        for(int i = 1; i <= V; i++) {
            if(visited[i])
                System.out.println(distance[i]);
            else
                System.out.println("INF");
        }

    }

}

class Edge implements  Comparable<Edge>{
    int vertex;
    int value;
    Edge(int vertex, int value) {
        this.vertex = vertex;
        this.value = value;
    }

    public int compareTo(Edge e) {
        if(this.value > e.value) return 1;
        else return -1;
    }
}
