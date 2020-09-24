package Class53;

import java.util.PriorityQueue;

public class PriorityTest {

    public static void main(String[] args) {
        String[] alphabets = {"banana", "e", "d", "h", "j", "apple", "c", "i", "B", "K", "O", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        PriorityQueue<String> pq = new PriorityQueue();
        for (int i = 0; i < 20; i++) {
            pq.add(alphabets[i]);
        }
        System.out.println(pq);
        for(int i = 0; i < 20 ; i++){
            System.out.println(pq.poll());
        }
    }
}
