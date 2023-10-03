package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

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

      //  al.remove("hari");
       al.remove(3);

        System.out.println("al="+al);


    }
}
