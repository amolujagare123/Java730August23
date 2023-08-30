package StringDemo;

public class StringComparison {

    public static void main(String[] args) {

        String str1 = "Amol";
        String str2 = "Amol";
        String str3 = "amol";
        String str4 = "xyz";
        String str5 = new String("Amol");

        /*int a1 = 10;
        int a2 = 20;
       System.out.println(a1==a2);*/

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

        System.out.println(str1==str2);
        System.out.println(str1==str5);

    }
}
