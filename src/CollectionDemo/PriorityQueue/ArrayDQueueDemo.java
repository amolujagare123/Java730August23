package CollectionDemo.PriorityQueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDQueueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque();

        adq.offer(12);
        adq.offer(22);
        adq.offer(13);
        adq.offer(42);
        adq.offer(15);
        adq.offer(62);
        adq.offer(43);
        //12 13 15 22 42 43 62
        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);
        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);




    }
}
