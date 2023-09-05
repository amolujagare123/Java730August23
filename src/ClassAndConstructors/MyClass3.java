package ClassAndConstructors;

public class MyClass3 {
    int a;
    double d;
    char c;
    String str;

    MyClass3(int a1, double d1,char c1,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


      MyClass3 ob = new MyClass3(13,45.89,'h',"amol");
      ob.display();

        ob.a = 10 ;
        ob.d = 23.67;
        ob.c = 'g';
        ob.str = "txt";

        ob.display();


    }

}
