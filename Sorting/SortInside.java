package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        int[] numbers = new int[line.length()];
        for(int i=0; i<line.length(); i++) {
            numbers[i] = Integer.parseInt(line.substring(i,i+1));
        }



        for(int i=0; i<line.length(); i++) {
            int max = i;
            for(int j=i+1; j<line.length(); j++){
                if(numbers[max] < numbers[j]) {
                    max = j;
                }
            }
            if(numbers[i] < numbers[max]) {
                int temp = numbers[i];
                numbers[i] = numbers[max];
                numbers[max] = temp;
            }
        }

        for(int i=0; i< numbers.length; i++) {
            System.out.print(numbers[i]);
        }
    }

}
