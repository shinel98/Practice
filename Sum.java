import java.util.Scanner;

public class Sum {
    /*
    문제:
        1번째 줄에 숫자의 개수 ( 1<= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다
        입력으로 주어진 숫자 N개의 합을 구하여라
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int total = 0;

        for(int i=0; i<N; i++){
            total += cNum[i]-'0';
        }
        System.out.println(total);

    }
}

