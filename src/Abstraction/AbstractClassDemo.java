package Abstraction;

public abstract class AbstractClassDemo {
    abstract void start();
    abstract void run();
    void display()
    {
        System.out.println("AbstractClassDemo - Display");
    }
}
 class ChildAbstract extends AbstractClassDemo
{
    void start()
    {
        System.out.println("start");
    }
    void run()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {
        AbstractClassDemo ob = new ChildAbstract();
        ob.start();
        ob.run();
    }
}
