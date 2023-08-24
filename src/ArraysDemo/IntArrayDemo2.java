package ArraysDemo;

public class IntArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {34,67,89,11,23,45,78,9};
       
        System.out.println("Length="+a.length);

        for (int i=0;i<a.length;i++)
          System.out.println(a[i]);

        System.out.println("\nfor each loop");
        for(int x:a) // for each loop
        {
            System.out.println(x);
        }
    }
}
