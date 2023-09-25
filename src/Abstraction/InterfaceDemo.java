package Abstraction;

public interface InterfaceDemo {

    void start();
    void run();

    default void display1()
    {
        System.out.println("display1");
    }

    static void display2()
    {
        System.out.println("display2");
    }

    private void display3()
    {
        System.out.println("display2");
    }
}
class ChildInterface implements InterfaceDemo
{
    public void start()
    {
        System.out.println("start");
    }
    public void run()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.run();
        ob.start();
        ob.display1();
        InterfaceDemo.display2();
       // ob.display3();

    }
}