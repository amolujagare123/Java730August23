package ClassAndConstructors;

public class MyClass {
    int a;
    double d;
    char c;
    String str;

    void method()
    {

    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
        method();
    }

    public static void main(String[] args) {

      /*  int x;
        x = 10;*/

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.d = 23.67;
        ob.c = 'g';
        ob.str = "txt";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 11 ;
        ob2.d = 33.67;
        ob2.c = 't';
        ob2.str = "java";
        ob2.display();
    }

}
