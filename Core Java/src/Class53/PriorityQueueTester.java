package Class53;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTester {

    public static void main(String[] args) {
        String[] alphabets = {"banana", "e", "d", "h", "j", "apple", "c", "i", "B", "K", "O", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        PriorityQueue<String> pq = new PriorityQueue(20, new Comparator<String>(){
            
            @Override
            public int compare(String i, String j){
                return i.compareToIgnoreCase(j);
            }
        });
        
        for (int i = 0; i < 20; i++){
            pq.offer(alphabets[i]);
        }
        
        for (int i  = 0; i < 20; i++){
            System.out.println(pq.poll());
        }
    }
}
