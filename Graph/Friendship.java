package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Friendship {

    static List<Integer>[] list;
    static boolean[] visited;

    static boolean isFriendship;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        list = new LinkedList[N];
        visited = new boolean[N];

        for(int i=0; i<N; i++) {
            list[i] = new LinkedList<>();
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        for(int i=0; i<N; i++) {
            DFS(i, 1);
            if(isFriendship)
                break;
        }
        if(isFriendship)
            System.out.println("1");
        else
            System.out.println("0");
    }
    static void DFS(int v, int depth) {
        if(depth == 5 || isFriendship) {
            isFriendship = true;
            return;
        }
        visited[v] = true;
        
        for(int i: list[v])
            if(!visited[i])
                DFS(i, depth+1);

        visited[v] = false;
    }
}
