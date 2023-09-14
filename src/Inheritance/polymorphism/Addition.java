package Inheritance.polymorphism;

public class Addition {

    int a;
    int b;

    void add()
    {
        int c ;
        c = a + b;
        System.out.println("c="+c);
    }

    void add(int a1)
    {
        int c ;
        c = a1 + b;
        System.out.println("c="+c);
    }

    void add(int a1,int b1)
    {
        int c ;
        c = a1 + b1;
        System.out.println("c="+c);
    }

    void add(double a1,double b1)
    {
        double c ;
        c = a1 + b1;
        System.out.println("c="+c);
    }
    void add(int a1,int b1,int c1)
    {
        int c ;
        c = a1 + b1 + c1;
        System.out.println("c="+c);
    }

    void add(String a1,String b1)
    {
        String c ;
        c = a1 + b1;
        System.out.println("c="+c);
    }

    public static void main(String[] args) {
        Addition ob = new Addition();
        ob.add();
        ob.add(34);
        ob.add(34,67);
        ob.add(34,67 , 12);
        ob.add(34.67,11.67);
        ob.add("Java_","_Selenium");

    }
}
