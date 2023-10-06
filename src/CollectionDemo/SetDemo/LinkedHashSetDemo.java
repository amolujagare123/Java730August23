package CollectionDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("pallavi");
        lhs.add("shraddha");
        lhs.add("hari");
        lhs.add("monu");
        lhs.add("nitish");
        lhs.add("shivani");
        lhs.add("ashish");
        lhs.add("ashish");
        System.out.println(lhs);
    }
}
