package CollectionDemo.VectorDemo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("size="+v.size()); // 0
        System.out.println("Capacity="+v.capacity()); // 10

        v.add("pallavi");
        v.add("shraddha");
        v.add("hari");
        v.add("monu");
        v.add("nitish");
        v.add("shivani");
        v.add("ashish");
        v.add("nitish");
        v.add("shivani");
        v.add("ashish");
        v.add("ashish");
        v.add("pallavi");
        v.add("shraddha");
        v.add("hari");
        v.add("monu");
        v.add("nitish");
        v.add("shivani");
        v.add("ashish");
        v.add("nitish");
        v.add("shivani");

        v.add("shivani");


        System.out.println("size="+v.size()); //
        System.out.println("Capacity="+v.capacity()); //

        System.out.println(v);

    }
}
