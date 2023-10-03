package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("pallavi");
        al.add("shraddha");
        al.add("hari");
        al.add("monu");
        al.add("nitish");
        al.add("shivani");
        al.add("ashish");

        System.out.println(al);
        System.out.println("size="+al.size());
        System.out.println(al.get(3));

        System.out.println("Using for loop");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("\nUsing for each loop");
        for (String str: al)
            System.out.println(str);

        System.out.println("\nUsing Iterator");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
