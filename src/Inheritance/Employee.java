package Inheritance;

public class Employee {
    int salary = 35000;
    void empWork()
    {
        System.out.println("check in");
        System.out.println("To do list");
    }
}

class Programmer extends Employee
{
    int bonus = 20000;
    void programmerWork()
    {
        System.out.println("Code");
        System.out.println("Debug");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
    }
}
