package SectionSum;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SectionSum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D[][] = new int[N+1][N+1];


        // D[][] 채워 넣기
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=1; j<=N; j++){
                D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + Integer.parseInt(st.nextToken());
            }
        }
        // 영역합 구하기
        for(int i=1; i<=M; i++){
            st = new StringTokenizer(bf.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
        }
    }
 }

