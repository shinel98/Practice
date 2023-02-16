package TwoPoint;

import java.util.Arrays;
import java.util.Scanner;

public class Armour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int materials[] = new int[N];

        for(int i=0; i<N; i++){
            materials[i] = sc.nextInt();
        }

        Arrays.sort(materials);
        
        int i=0;
        int j=N-1;
        int count = 0;

        while(i < j) {
            if(materials[i] + materials[j] > M){
                j--;

            }
            else if(materials[i] + materials[j] < M){
                i++;
            }
             else {
                count++;
                j--;
                i++;
            }


        }
        System.out.println(count);

    }
}
