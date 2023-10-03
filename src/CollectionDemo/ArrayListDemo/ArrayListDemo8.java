package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo8 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("pallavi");
        al.add("shraddha");
        al.add("hari");
        al.add("monu");
        al.add("nitish");
        al.add("shivani");
        al.add("ashish");

        System.out.println("al="+al);

        // remove the elements which has length less than 5
        al.removeIf(str -> str.length() < 5);
        System.out.println(al);


    }
}
