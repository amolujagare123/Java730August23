package staticNFinal;

public class Student2 {
    int rno;
    String name;
    public static String college="ITS";

    void display() // non static method
    {
        System.out.println("rno="+rno); // non static : allowed
        System.out.println("name="+name); // non static : allowed
        System.out.println("college="+college);//  static : allowed
        nonStaticMethod1(); // non static : allowed
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
       // System.out.println("rno="+rno); // non static : not allowed
     //   System.out.println("name="+name); // non static : not allowed
        System.out.println("college="+college);//  static : allowed
      //  nonStaticMethod1(); // non static : not allowed
        staticMethod2(); //  static : allowed

        Student2 s1 = new Student2();
        s1.nonStaticMethod1();
    }
    public static void staticMethod2()
    {
        System.out.println("staticMethod2");

       // main();
    }

    void nonStaticMethod1()
    {
        System.out.println("NonStaticMethod1");
    }
    void nonStaticMethod2()
    {
        System.out.println("NonStaticMethod2");
    }



    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.staticMethod2();

        staticMethod1();
        s1.nonStaticMethod1();


        Student2.staticMethod2();


    }
}
