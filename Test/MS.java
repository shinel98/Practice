//package Test;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class MS {
//    static int A[];
//    static int tmp[];
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        A= new int[N+1];
//        tmp = new int[N+1];
//
//        for(int i=1; i<=N; i) {
//            A[i] = Integer.parseInt(br.readLine());
//        }
//
//        merge_sort(1, N);
//
//    }
//
//    static void merge_sort(int s, int e) {
//        if(e-s < 1)
//            return;
//
//        int m = s + (e-s) / 2;
//        merge_sort(s, m);
//        merge_sort(m+1, e);
//
//
//
//    }
//}
