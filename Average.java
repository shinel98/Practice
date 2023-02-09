import java.util.Scanner;

public class Average {
    /*
    문제
        자기 점수의 최댓값을 고르고 모든 점수를 점수/최댓값*100 으로 고쳤다. 이때, 새로운 평균을 구하라
        1번째 줄에는 시험을 본 과목의 개수 N개, (1 <= N <= 1000)
        2번째 줄에는 현재 성적 (0<= 성적 <= 100), 적어도 한개의 값은 0보다 크다
     */

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<A.length; i++){
            if(max < A[i])
                max = A[i];
            sum += A[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
