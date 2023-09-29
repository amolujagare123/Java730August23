package WrapperClass;

public class WrapperClassDemo {
    public static void main(String[] args) {

        int i = 5;
        Integer ii = new Integer(5); //wrapping/boxing
        System.out.println("i="+i);
        System.out.println("ii="+ii);

        Integer ii2 = 5; //auto wrapping/ auto boxing
        System.out.println("ii2="+ii2);

        int k1 = ii.intValue(); //unwrapping / unboxing
        int k2 = ii;  //auto unwrapping /auto unboxing
        System.out.println("k1="+k1);
        System.out.println("k2="+k2);
    }
}
