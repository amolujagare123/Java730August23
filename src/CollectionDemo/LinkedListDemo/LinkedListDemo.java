package CollectionDemo.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("pallavi");
        ll.add("shraddha");
        ll.add("hari");
        ll.add("monu");
        ll.add("nitish");
        ll.add("shivani");
        ll.add("ashish");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
