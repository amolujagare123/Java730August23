package ArraysDemo;

public class IntArrayExmple {

    public static void main(String[] args) {

        int[] a = {34,67,89,11,23,45,78,9};
        System.out.println("Length="+a.length);

        for (int i=0;i<a.length;i++) {

            if(a[i]%2==0)
               System.out.println(a[i]+" Even");
            else
                System.out.println(a[i]+" Odd");
        }



        for(int x:a) // for each loop
        {
            if(x%2==0)
              System.out.println(x+" Even");
            else
                System.out.println(x+" Odd");
        }
    }
}
