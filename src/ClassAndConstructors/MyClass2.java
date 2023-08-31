package ClassAndConstructors;

public class MyClass2 {
    int a;
    double d;
    char c;
    String str;
    /*MyClass2()
    {

    }*/
    MyClass2()
    {
        a = 23;
        d = 90.11;
        c = 'a';
        str = "selenium";
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


      MyClass2 ob = new MyClass2();
        ob.display();

        ob.a = 10 ;
        ob.d = 23.67;
        ob.c = 'g';
        ob.str = "txt";

        ob.display();



  /*      int a ;

        a = 10;

        a = 11;

        System.out.println(a);*/

    }

}
