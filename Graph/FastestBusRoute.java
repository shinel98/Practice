package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 11404
public class FastestBusRoute {
    static int[][] route;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        route = new int[N+1][N+1];


        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(i==j)
                    route[i][j] = 0;
                else
                    route[i][j] = 10000001;
            }
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if(v < route[s][e])
                route[s][e] = v;
        }

        for(int k=1; k<=N ;k++) {
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++) {
                    if(route[i][j] > route[i][k] + route[k][j])
                        route[i][j] = route[i][k] + route[k][j];
                }
            }
        }

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                if(route[i][j] == 100001) System.out.print("0 ");
                else System.out.print(route[i][j] + " ");
            }
            System.out.println();
        }
    }
}
