package SectionSum;/*
문제
    1번째 줄에 수의 개수 N (1 <= N <= 100,000), 합을 구해야 하는 횟수 M (1 <= M <= 100,000), 2번째 줄에 N개의 수가 주어진다.
    각 수는 1000보다 작거나 같은 자연수이다. 3번째 줄 부터는 M개의 줄에 합을 구해야하는 구간 i와 j가 주어진다.

시간 제한 0.5초

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SectionSum {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dataNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long S[] = new long[dataNo+1];
        long A[] = new long[dataNo+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=dataNo; i++){
            A[i] = Integer.parseInt(st.nextToken());
            S[i] = S[i-1] + A[i];
        }

        for(int i=0; i<quizNo; i++){
            st = new StringTokenizer(br.readLine());
            int range1 = Integer.parseInt(st.nextToken());
            int range2 = Integer.parseInt(st.nextToken());
            long answer = S[range2] - S[range1-1];
            System.out.println(answer);
        }

    }
}
