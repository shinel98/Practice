package Sorting;

import java.util.Scanner;

public class BubbleSort2 {

    public static int[] A;
    public static int[] tmp;
    public static long count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        A = new int[N+1];
        tmp = new int[N+1];
        for(int i=1; i<=N; i++) {
            A[i] = sc.nextInt();
        }

        int s = 1;
        int e = N;
        merge_sort(s, e);
        System.out.println(count);
    }

    public static void merge_sort(int s, int e) {

        if(e-s < 1)
            return;

        int m = s + (e - s) /2;

        merge_sort(s, m);
        merge_sort(m+1, e);

        for(int i=s; i<=e; i++) {
            tmp[i] = A[i];
        }

        int k = s;
        int index1 = s;
        int index2 = m+1;

        while(index1 <= m && index2 <=e) {
            if(tmp[index1] > tmp[index2]) {
                A[k] = tmp[index2];
                count = count +  index2 - k;
                index2++;
                k++;
            }
            else {
                A[k] = tmp[index1];
                index1++;
                k++;
            }
        }

        while(index1 <= m) {
            A[k++] = tmp[index1++];
        }
        while(index2 <= e) {
            A[k++] = tmp[index2++];
        }


    }
}
