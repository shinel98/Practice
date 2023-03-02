package Stack;

import java.util.Scanner;
import java.util.Stack;

public class SequenceStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        boolean result = true;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int num = 1;
        for(int i=0; i<N; i++){
            int su = A[i];
            if(num <= su) {
                while (num <= su) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                int cur_num = stack.pop();
                if(cur_num > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb.toString());
    }
}
