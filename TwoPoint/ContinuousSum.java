package TwoPoint;

import java.util.Scanner;

public class ContinuousSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int end_point = 1;
        int start_point = 1;
        long sum = 1;
        int count = 1;

        while(end_point != N) {
             if(sum == N) {
                 end_point++;
                 count++;
                 sum = sum + end_point;
             }
             else if(sum < N) {
                 end_point++;
                 sum = sum + end_point;
             }
             else {
                 sum = sum - start_point;
                 start_point++;
             }
        }
        System.out.println(count);
    }
}
