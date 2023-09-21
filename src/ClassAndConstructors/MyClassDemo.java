package ClassAndConstructors;

import staticNFinal.Student2;

import static staticNFinal.Student2.staticMethod1;
import static staticNFinal.Student2.staticMethod2;
import static staticNFinal.Student2.college;
public class MyClassDemo {
    public int a;
    public double d;
    public char c;
    public String str;

    public void display()
    {

        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        staticMethod1();
        staticMethod2();

        college = "Pune college";

    }

}
