package Inheritance.SuperDemo;

public class Employee {
    int salary = 35000;
    int workingHours = 8;
    Employee()
    {

        System.out.println("employee constructor");
    }
    Employee(int a)
    {
        System.out.println("employee constructor with a="+a);
    }
    void sampleMethod()
    {
        System.out.println("sampleMethod : Employee");
    }
    void empWork()
    {
        System.out.println("check in");
        System.out.println("To do list");
    }
}

class Programmer extends Employee
{
    Programmer()
    {
        super(10);
        System.out.println("Programmer constructor");
    }
    int workingHours = 10;
    void sampleMethod()
    {
        System.out.println("sampleMethod : Programmer");
    }
    int bonus = 20000;
    void programmerWork()
    {
        System.out.println("Code");
        System.out.println("Debug");
        System.out.println("workingHours="+super.workingHours);
        super.sampleMethod();
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();

        p.programmerWork();

    }
}
