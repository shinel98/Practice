package TwoPoint;

import java.io.*;import java.nio.Buffer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FindMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt(st.nextToken());
        Integer L = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Node> myDeque = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int now = Integer.parseInt(st.nextToken());
            while(!myDeque.isEmpty() && myDeque.getLast().value > now){
                myDeque.removeLast();
            }
            myDeque.addLast(new Node(now, i));

            if(myDeque.getFirst().index <= i-L){
                myDeque.removeFirst();
            }
            bw.write(myDeque.getFirst().value+ " ");
        }
        bw.flush();
        bw.close();
    }
    static class Node{

        public int value;
        public int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
