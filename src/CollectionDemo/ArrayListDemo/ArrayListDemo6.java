package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(11);
        al.add(21);
        al.add(13);
        al.add(41);
        al.add(15);
        al.add(61);
        al.add(17);


        System.out.println("al="+al);


        al.remove(new Integer(15));

        System.out.println("al="+al);


    }
}
