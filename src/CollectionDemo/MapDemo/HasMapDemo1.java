package CollectionDemo.MapDemo;

import java.util.HashMap;

public class HasMapDemo1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(12,"Pallavi");
        hm.put(22,"Hari");
        hm.put(32,"Monu");
        hm.put(42,"Shraddha");
        hm.put(72,"Pallavi");
        hm.put(12.56,'6');
        hm.put(71,true);
        hm.put(71,23.56);
        hm.put(null,23.56);
        hm.put(34,null);
        hm.put(44,null);
        hm.put(54,null);
        hm.put(null,'g');

        System.out.println(hm);
        hm.put(42,"Amol");
        System.out.println(hm);
    }
}
