package CollectionDemo.MapDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(12,"Pallavi");
        tm.put(22,"Hari");
        tm.put(32,"Monu");
        tm.put(42,"Shraddha");
        tm.put(72,"Pallavi");
        tm.put(43,"Amol");
        tm.put(44,"Amol");

        System.out.println("tm="+tm);

       

    }
}
