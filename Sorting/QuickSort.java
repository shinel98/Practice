package Practice.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 데이터 개수 입력
        int data_num = sc.nextInt();
        // 찾고자하는 인덱스 입력
        int k = sc.nextInt();
        int[] arr = new int[data_num];

        // 배열에 저장
        for(int i=0; i<data_num; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, data_num-1, k-1);
        System.out.println(arr[k-1]);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] arr, int start, int end, int k) {
        if(start < end) {
            int pivot = findPivot(arr, start, end);
            if (pivot == k) {
                return;
            } else if (pivot > k) {
                quickSort(arr, start, pivot-1, k);
            } else if (pivot < k) {
                quickSort(arr, pivot+1, end, k);
            }
        }
    }

    public static int findPivot(int[] arr, int start, int end) {

        if(start+1 == end){
            if(arr[start] > arr[end]) swap(arr, start, end);
            return end;
        }

        int M = (start+end)/2;
        swap(arr, start, M);
        int pivot = arr[start];
        int i = start+1; int j= end;

        while(i<=j) {
            while(pivot < arr[j] && j > 0){
                j--;
            }
            while(pivot > arr[i] && i < arr.length-1){
                i++;
            }
            if(i<=j){
                swap(arr, i++, j--);
            }
        }

        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void swap(int[] A, int i, int j){

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
