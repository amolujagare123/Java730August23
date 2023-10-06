package CollectionDemo.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HasMap5 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"Pallavi");
        hm.put(22,"Hari");
        hm.put(32,"Monu");
        hm.put(42,"Shraddha");
        hm.put(72,"Pallavi");
        hm.put(43,"Amol");
        hm.put(44,"Amol");

        System.out.println("hm="+hm);

        Set s = hm.keySet();
        System.out.println(s);

        Collection c = hm.values();
        System.out.println(c);

        Set entrySet= hm.entrySet();
        System.out.println(entrySet);


    }
}
