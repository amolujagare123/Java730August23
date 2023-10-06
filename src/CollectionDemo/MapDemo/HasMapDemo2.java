package CollectionDemo.MapDemo;

import java.util.HashMap;

public class HasMapDemo2 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"Pallavi");
        hm.put(22,"Hari");
        hm.put(32,"Monu");
        hm.put(42,"Shraddha");
        hm.put(72,"Pallavi");

        System.out.println(hm);
        hm.put(42,"Amol");
        System.out.println(hm);
    }
}
