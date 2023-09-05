package ClassAndConstructors;

public class MyClass4 {
    int a;
    double d;
    char c;
    String str;

    MyClass4(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


      MyClass4 ob = new MyClass4(13,45.89,'h',"amol");
      ob.display();

        ob.a = 10 ;
        ob.d = 23.67;
        ob.c = 'g';
        ob.str = "txt";

        ob.display();


    }

}
