package Inheritance;

public class Bird {

    void fly()
    {
        System.out.println("fly");
    }

}
class Sparrow extends Bird
{

    void sparrowColor()
    {
        System.out.println("yellow");
    }

    public static void main(String[] args)
    {
        Bird b = new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        Crow c = new Crow();
        c.crowColor();
        c.fly();
    }



}

class Crow extends Bird
{

    void crowColor()
    {
        System.out.println("black");
    }

}