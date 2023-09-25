package ExceptionHandling;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[0] = 12;
            a[1] = 13;
            a[2] = 22;
            a[3] = 14;
            a[4] = 32;
            a[5] = 15;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }


        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
