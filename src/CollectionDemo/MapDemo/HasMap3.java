package CollectionDemo.MapDemo;

import java.util.HashMap;

public class HasMap3 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"Pallavi");
        hm.put(22,"Hari");
        hm.put(32,"Monu");
        hm.put(42,"Shraddha");
        hm.put(72,"Pallavi");
        hm.put(43,"Amol");

        System.out.println("hm="+hm);

        System.out.println(hm.get(32));
        hm.remove(32);
        System.out.println("hm="+hm);

    }
}
