package Abstraction;

public interface MyInterface {
    void start();
    void run();

   void display();

}

interface MyInterface2 {
    void display();
}

class ChildInterface2 implements MyInterface,MyInterface2
{
    public void start()
    {
        System.out.println("start");
    }
    public void run()
    {
        System.out.println("start");
    }

    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        MyInterface2 ob = new ChildInterface2();
        ob.display();



    }
}