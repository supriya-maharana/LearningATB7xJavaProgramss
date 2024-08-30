package Aug.ex_24082024;

import java.util.PriorityQueue;

public class Lab238 {
    public static void main(String[] args) {
        // Queue - < 1% in Automation
        //
        PriorityQueue pq=new PriorityQueue();
        {
            pq.offer("1");
            pq.offer("3");
            pq.offer("4");
            pq.offer("6");
            pq.offer("2");
            System.out.println(pq);
           System.out.println(pq.peek());
            System.out.println(pq.size());
            System.out.println(pq.poll());
        }
    }
}
