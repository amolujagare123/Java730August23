package CollectionDemo.MapDemo;

import java.util.HashMap;

public class HasMap4 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(12,"Pallavi");
        hm.put(22,"Hari");
        hm.put(32,"Monu");
        hm.put(42,"Shraddha");
        hm.put(72,"Pallavi");
        hm.put(43,"Amol");

        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(22));
        System.out.println(hm.containsValue("Pallavi"));

    }
}
