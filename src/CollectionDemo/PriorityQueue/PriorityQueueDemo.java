package CollectionDemo.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue();

       /* pq.add(12);
        pq.add(22);
        pq.add(13);
        pq.add(42);
        pq.add(15);
        pq.add(62);
        pq.add(43);*/

        pq.offer(12);
        pq.offer(22);
        pq.offer(13);
        pq.offer(42);
        pq.offer(15);
        pq.offer(62);
        pq.offer(43);

        //12 13 15 22 42 43 62

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());




    }
}
