package Inheritance;


public class Animal
{
    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends  Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends  Dog
{
    void weep()
    {
        System.out.println("weep");
    }
}



 class TestMultilevelInheritance {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
