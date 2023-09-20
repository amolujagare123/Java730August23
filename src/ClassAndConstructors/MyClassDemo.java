package ClassAndConstructors;

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

      /*  int x;
        x = 10;*/

        MyClassDemo ob = new MyClassDemo();
        ob.a = 10 ;
        ob.d = 23.67;
        ob.c = 'g';
        ob.str = "txt";
        ob.display();

        MyClassDemo ob2 = new MyClassDemo();
        ob2.a = 11 ;
        ob2.d = 33.67;
        ob2.c = 't';
        ob2.str = "java";
        ob2.display();
    }

}
