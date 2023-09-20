package Methods;

import ClassAndConstructors.MyClassDemo;

import java.util.Date;

public class MethodsWithArguments {


    void methodInt(int a)
    {
        System.out.println("a="+a);
    }
    void methodInt2(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    void method1(int a,double b,boolean c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    void method2(String str, Date d)
    {
        System.out.println(str+"="+d);
    }
    void methodArrayArgument(int[] a)
    {
        for (int x:a)
            System.out.print(x+"\t");

        System.out.println();
    }

    void method2DArrayArgument(String[][] s)
    {
        for (int i=0;i<s.length;i++)
        {
            for (int j=0;j<s[0].length;j++)
            {
                System.out.print(s[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public void setMyObject(MyClassDemo ob)
    {
        ob.a = 10;
        ob.d = 12.34;
        ob.c = 'h';
        ob.str ="amol";
    }
    public static void main(String[] args) {

        MethodsWithArguments ob = new MethodsWithArguments();
       // ob.methodInt(34);
      //  ob.methodInt2(34,34,11);
      //  ob.method1(12,34.67,true);
      //  ob.method2("Todays Date",new Date());

        int[] arr = {12,34,56,78,11,22,45,67,10};

      //  ob.methodArrayArgument(arr);

        String[][] twoDimensionalArray = {
                {"Rahul", "Sneha", "Amit"},
                {"Priya", "Suresh", "Deepa"},
                {"Manish", "Kavita", "Sanjay"},
                {"Anjali", "Rajesh", "Pooja"}
        };

     //   ob.method2DArrayArgument(twoDimensionalArray);

        MyClassDemo myClassDemo = new MyClassDemo();
        myClassDemo.display();

        ob.setMyObject(myClassDemo);

        myClassDemo.display();
    }
}
