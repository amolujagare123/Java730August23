package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo7 {

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

        al2.add("shraddha");
        al2.add("pallavi");
        al2.add("hari");
        al2.add("ashish");
        al2.add("kuily");
        al2.add("Amol");

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);


    }
}
