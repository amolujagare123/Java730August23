package Methods;

import ClassAndConstructors.MyClassDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsReturningValue {

    int myInt()
    {
        int b = 10;
        //return 22;
        return b;
    }

    double myDouble()
    {
        double b = 112.10;
        //return 22;
        return b;
    }

    char myChar()
    {
        char b = 'a';
        //return 22;
        return b;
    }

    boolean isTrue()
    {
        boolean b = false;
        //return 22;
        return b;
    }

    String getString()
    {
        String str = "My String is here";
        return str;
    }

    Date getDate()
    {

        return new Date();
    }

    SimpleDateFormat getMyPattern()
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return sd;
    }


    int[] getMyArray()
    {
       int[] arr = {67,89,12,34,56,78,90,11,23,23,13};
       return arr;
    }
    String[][] getMyStringArray()
    {
        String[][] twoDimensionalArray = {
                {"Rahul", "Sneha", "Amit"},
                {"Priya", "Suresh", "Deepa"},
                {"Manish", "Kavita", "Sanjay"},
                {"Anjali", "Rajesh", "Pooja"}
        };

        return twoDimensionalArray;
    }

    MyClassDemo getMyClassObject()
    {
        MyClassDemo obj = new MyClassDemo();
        obj.a = 10;
        obj.d = 19.11;
        obj.c = 'g';
        obj.str = "amol";

        return obj;
    }

    public static void main(String[] args) throws ParseException {

        int i;
        i = 10;
        System.out.println(i);
        int a = i ;

        MethodsReturningValue ob = new MethodsReturningValue();
        System.out.println("ob.myInt()="+ob.myInt());
        int var1 = ob.myInt();

        System.out.println("ob.myDouble()="+ob.myDouble());
        double var2 = ob.myDouble();

        System.out.println("ob.myChar()="+ob.myChar());
        char var3 = ob.myChar();

        System.out.println("isTrue="+ob.isTrue());
        boolean var4 = ob.isTrue();

        System.out.println("My String = "+ob.getString());
        String s = ob.getString();

        System.out.println(ob.getDate());


        String str = "20/08/2022";

        Date date = ob.getMyPattern().parse(str);
        System.out.println(date);


        int[] myArray = new int[10];

        myArray = ob.getMyArray();

        for (int j=0;j<myArray.length;j++)
            System.out.println(myArray[j]);

        String[][] stArr = ob.getMyStringArray();

        for (int j=0;j< stArr.length;j++)
        {
            for (int k=0;k<stArr[0].length;k++)
            {
                System.out.print(stArr[j][k]+"\t");
            }
            System.out.println();
        }

        MyClassDemo myClassDemo = ob.getMyClassObject();
        myClassDemo.display();

    }

}
