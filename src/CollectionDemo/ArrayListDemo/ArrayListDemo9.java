package CollectionDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo9 {

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

       // remove the elements which are divisible by 3
        //  al.removeIf(str -> str.length() < 5);
        al.removeIf(i -> i%3==0 );
        System.out.println("al="+al);



    }
}
