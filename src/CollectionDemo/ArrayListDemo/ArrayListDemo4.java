package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

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

        ArrayList<String> al2 = new ArrayList<>();
        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);


    }
}
