package TwoPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindGoodNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count=0;

        for(int k=0; k<N; k++){
            int i=0, j=N-1;
            long K = A[k];
            while(i < j) {
                if (A[i] + A[j] == K) {
                    if(i != k && j != k){
                        count++;
                        break;
                    }
                }
                else if(A[i] + A[j] < K){
                    i++;
                }
                else
                    j--;
            }
        }
        System.out.println(count);
        bf.close();
    }
}
