package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty());

        al.add("pallavi");
        al.add("shraddha");
        al.add("hari");
        al.add("monu");
        al.add("nitish");
        al.add("shivani");
        al.add("ashish");
        System.out.println(al.isEmpty());

        System.out.println(al);

        al.set(4,"XYZ");

        System.out.println(al);
       /* al.clear();
        System.out.println(al);*/


    }
}
