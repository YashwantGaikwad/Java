import java.util.LinkedList;
import java.util.Queue;

public class CollLinkedlistQueue {
    public static void main(String args[]){
        Queue<Integer> pq = new LinkedList<Integer>();

        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(30);
        pq.add(25);

        System.out.println("linkedlist: " + pq);
        // Printing the top element
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());
    }
}
