package TwoPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlidingWindow {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];

        checkSecret = 0;
        int result = 0;

        st = new StringTokenizer(br.readLine());
        A = st.nextToken().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0)
                result++;
        }

        for (int i = 0; i < P; i++) {
            add(A[i]);
        }

        for(int i=P; i<S; i++){
            int j = i-P;
            add(A[i]);
            remove(A[j]);
            if(checkSecret == 4)
                result++;
        }
        System.out.println(result);
        br.close();
    }

        private static void add (char c){
            switch (c) {
                case 'A':
                    myArr[0]++;
                    if(myArr[0] == checkArr[0])
                        checkSecret++;
                    break;
                case 'C':
                    myArr[1]++;
                    if(myArr[1] == checkArr[1])
                        checkSecret++;
                    break;
                case 'G':
                    myArr[2]++;
                    if(myArr[2] == checkArr[2])
                        checkSecret++;
                    break;
                case 'T':
                    myArr[3]++;
                    if(myArr[3] == checkArr[3])
                        checkSecret++;
                    break;
            }
        }

        private static void remove(char c){
            switch(c){
                case 'A':
                    if(myArr[0] == checkArr[0])
                        checkSecret--;
                    myArr[0]--;
                case 'C':
                    if(myArr[1] == checkArr[1])
                        checkSecret--;
                    myArr[1]--;
                case 'G':
                    if(myArr[2] == checkArr[2])
                        checkSecret--;
                    myArr[2]--;
                case 'T':
                    if(myArr[3] == checkArr[3])
                        checkSecret--;
                    myArr[3]--;
            }
        }

}
