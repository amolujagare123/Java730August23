package ArraysDemo;

public class IntArrayDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 13;
        a[1] = 34;
        a[2] = 11;
        a[3] = 89;
        a[4] = 90;

        System.out.println("Length="+a.length);

        for (int i=0;i<a.length;i++)
          System.out.println(a[i]);

        for(int x:a) // for each loop
        {
            System.out.println(x);
        }
    }
}
